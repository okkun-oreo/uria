package me.okkun.uria.translator

import me.okkun.uria.data.entity.Config
import me.okkun.uria.domain.model.MasterData
import me.okkun.uria.domain.model.PropertyData

class MasterDataTranslator {
    companion object {
        fun to(yaml: Config) : List<MasterData> {
            val masters = yaml.unity.masters ?: return listOf()
            val mtList  = mutableListOf<MasterData>()
            for (master in masters) {
                val props: MutableList<PropertyData> = mutableListOf()
                for (prop in master.props) {
                    props.add(PropertyData(prop.name, prop.type))
                }

                mtList.add(MasterData(
                        yaml.unity.applicationName,
                        master.name,
                        props
                ))
            }
            return mtList
        }
    }
}