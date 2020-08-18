package me.okkun.uria.translator

import me.okkun.uria.data.entity.Config
import me.okkun.uria.domain.model.DomainModelData

class DomainModelTranslator {
    companion object {
        fun to(yaml: Config) : List<DomainModelData> {
            val models = yaml.unity.models ?: return listOf()
            val resList = mutableListOf<DomainModelData>()
            for (model in models) {
                resList.add(DomainModelData(
                        yaml.unity.applicationName,
                        model.name,
                        model.props
                ))
            }
            return resList
        }
    }
}