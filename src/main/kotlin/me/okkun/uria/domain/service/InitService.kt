package me.okkun.uria.domain.service

import com.okkun.common.domain.model.TextFile
import com.okkun.common.entity.IndexesEntity
import com.okkun.common.utils.ResourceLoader
import com.okkun.common.utils.StringEx
import com.okkun.common.utils.reader.GsonUtility
import me.okkun.uria.Constants
import me.okkun.uria.data.entity.Config
import me.okkun.uria.data.entity.SceneEntity
import me.okkun.uria.data.entity.UnityEntity
import me.okkun.uria.utils.cli.Env
import me.okkun.uria.utils.cli.InputReader
import me.okkun.uria.utils.exception.ErrorCode
import me.okkun.uria.utils.exception.UriaException
import java.io.File

class InitService(private val args: Array<String>) : StringEx {

  fun execute() {
    if (File(Constants.CONFIG_PATH).exists()) {
      throw UriaException(ErrorCode.E1002)
    }
    FileEx.mkdir(Constants.DOCUMENT_DIR)
    FileEx.mkdir(Constants.UNITY_DIR)
    FileEx.mkdir(Constants.ANDROID_DIR)
    FileEx.mkdir(Constants.IOS_DIR)
    FileEx.mkdir(Constants.TOOLS_DIR)

    val inputReader = InputReader()
    val name = inputReader.question("プロジェクト名を入力してください")

    val unityPath  = Env.getUnityPath()
    val workingDir = Env.getWorkingDir()
    val path       = "${Constants.UNITY_DIR}/${name.toPascalCase()}"
    val command = "${unityPath} -createProject ${workingDir}/${path}/ -quit"
    try {
      Runtime.getRuntime().exec(command)
    } catch (e: Exception) {
      println(e.message)
    }

    val config = Config(UnityEntity(name, path, mutableListOf<SceneEntity>()))
    GsonUtility(Constants.CONFIG_PATH).write(config)

    val indexes = GsonUtility(Constants.INIT_INDEXES_FILE).readResource(IndexesEntity::class.java)
    for (index in indexes?.indexes ?: emptyList()) {
      ResourceLoader.read(index)?.let { content ->
        val textFile = TextFile(index.outputPath)
        textFile.write(content, false)
      }
    }
  }
}