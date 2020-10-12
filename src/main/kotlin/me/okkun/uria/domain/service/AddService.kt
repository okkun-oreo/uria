package me.okkun.uria.domain.service

import com.okkun.common.utils.reader.GsonUtility
import me.okkun.uria.Constants
import me.okkun.uria.data.entity.Config
import me.okkun.uria.data.entity.SceneEntity
import me.okkun.uria.utils.UriaResources
import me.okkun.uria.utils.cli.InputReader
import me.okkun.uria.utils.exception.ErrorCode
import me.okkun.uria.utils.exception.UriaException

class AddService(private val args: Array<String>) {


  fun execute(type: String?) {
    val gson = GsonUtility(Constants.CONFIG_PATH)
    val config = gson.read(Config::class.java) ?: throw UriaException(ErrorCode.E1003)
    val inputReader = InputReader()
    val index = inputReader.question("以下から選択してください", addList)
    if (index == 0) {
      val name   = inputReader.question("シーン名を入力してください")
      val scenes = config.unity.scenes
      if (scenes != null) {
        for (scene in config.unity.scenes) {
          if (name.toUpperCase() == scene.name.toUpperCase()) {
            throw UriaException(ErrorCode.E1004)
          }
        }
      }
      config.unity.scenes?.add(SceneEntity(name, "", listOf()))
      gson.write(config)
    }

//    // val yamlUtility = YamlUtility(UriaResources.Config.CONFIG.output)
//
//    val yaml: Config = yamlUtility.read(Config.serializer()) ?: return
//
//    if (type == "scene") {
//      println("Scene名を入力してください")
//      val name = readLine() ?: return
//      println("説明を入力してください")
//      val desc = readLine() ?: return
//      println(name + " : " + desc)
//      yaml.unity.scenes?.add(SceneEntity(name, desc, listOf()))
//      yamlUtility.write(Config.serializer(), yaml)
//    }
  }

  companion object {
    val addList = arrayOf("scene", "usecase")
  }


}