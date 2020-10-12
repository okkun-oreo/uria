package me.okkun.uria.domain.service

import com.okkun.common.domain.service.PhoenixService
import com.okkun.common.entity.IndexesEntity
import com.okkun.common.utils.ResourceLoader
import com.okkun.common.utils.exception.PhoenixException
import com.okkun.common.utils.reader.GsonUtility
import me.okkun.uria.Constants
import me.okkun.uria.data.entity.Config
import me.okkun.uria.domain.parser.SceneParser
import me.okkun.uria.translator.SceneTranslator
import me.okkun.uria.utils.UriaResources
import me.okkun.uria.utils.exception.ErrorCode
import me.okkun.uria.utils.exception.UriaException

class MakeService(private val args: Array<String>) {

  fun execute() {
    val config = GsonUtility(Constants.CONFIG_PATH).read(Config::class.java) ?: throw UriaException(ErrorCode.E1003)
    val phoenix = PhoenixService()
    GsonUtility(Constants.VIEW_INDEXES_FILE).readResource(IndexesEntity::class.java)?.let { value ->
      for (scene in SceneTranslator.to(config)) {
        phoenix.execute(scene, value.indexes, SceneParser())
      }
    }
    println("完了しました!")
  }


}