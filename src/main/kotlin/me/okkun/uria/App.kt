/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package me.okkun.uria

import com.okkun.common.domain.service.PhoenixService
import com.okkun.common.utils.reader.YamlReader
import me.okkun.uria.data.entity.Config
import me.okkun.uria.data.entity.DomainModelEntity
import me.okkun.uria.data.entity.MasterDataEntity
import me.okkun.uria.domain.parser.*
import me.okkun.uria.translator.DomainModelTranslator
import me.okkun.uria.translator.MasterDataTranslator
import me.okkun.uria.translator.SceneTranslator
import me.okkun.uria.translator.UtilsTranslator
import me.okkun.uria.utils.UriaResources
import me.okkun.uria.utils.excel.WorkBook

fun main(args: Array<String>) {
    val path   = args.getOrNull(0) ?: return
    if(path == "init") {
        FileEx.mkdir("00_Documents")
        FileEx.mkdir("01_Unity")
        FileEx.mkdir("02_AndroidLib")
        FileEx.mkdir("03_iOSLib")
        FileEx.mkdir("04_Tools")
        return;
    }
    
    val yaml   = YamlReader(path).read(Config.serializer()) ?: return
    val uria = PhoenixService()

    for (useCase in SceneTranslator.toUseCase(yaml)) {
        uria.execute(useCase, UriaResources.UseCase.values().toList(), UseCaseParser())
    }

    for (scene in SceneTranslator.to(yaml)) {
        uria.execute(scene, UriaResources.View.values().toList(), SceneParser())
    }

    for (master in MasterDataTranslator.to(yaml)) {
        uria.execute(master, UriaResources.MasterData.values().toList(), MasterDataParser())
    }

    for (model in DomainModelTranslator.to(yaml)) {
        uria.execute(model, UriaResources.Domain.values().toList(), DomainModelParser())
    }

    val util = UtilsTranslator.to(yaml)
    uria.execute(util, UriaResources.Utils.values().toList(), UtilsParser())

}
