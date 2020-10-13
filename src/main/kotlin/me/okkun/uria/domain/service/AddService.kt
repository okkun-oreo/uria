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

  fun execute() {
    val gson = GsonUtility(Constants.CONFIG_PATH)
    val config = gson.read(Config::class.java) ?: throw UriaException(ErrorCode.E1003)
    val inputReader = InputReader()
    var type = getType(args.getOrNull(1))
    if (type == Type.UNKNOWN) {
      val index = inputReader.question("以下から選択してください", addList)
      type = getType(addList[index])
    }

    if (type == Type.SCENE) {
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


  private fun getType(str: String?) : Type {
    val value = str ?: return Type.UNKNOWN
    when(value) {
      "scene" -> {
        return Type.SCENE
      }
      "usecase" -> {
        return Type.USE_CASE
      }
    }
    return Type.UNKNOWN
  }


  enum class Type {
    SCENE,
    USE_CASE,
    UNKNOWN
  }

  companion object {
    val addList = arrayOf("scene", "usecase")
  }


}