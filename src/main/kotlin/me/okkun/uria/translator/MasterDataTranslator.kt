package me.okkun.uria.translator

import me.okkun.uria.data.entity.Config
import me.okkun.uria.domain.model.MasterData

class MasterDataTranslator {
    companion object {
        fun to(yaml: Config) : List<MasterData> {
            val masters = yaml.unity.masters ?: return listOf()
            val mtList  = mutableListOf<MasterData>()
            for (master in masters) {
                mtList.add(MasterData(
                        yaml.unity.applicationName,
                        master.name
                ))
            }
            return mtList
        }
    }
}