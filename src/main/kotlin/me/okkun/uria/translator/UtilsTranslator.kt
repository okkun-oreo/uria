package me.okkun.uria.translator

import me.okkun.uria.data.entity.Config
import me.okkun.uria.domain.model.UtilData


class UtilsTranslator {
    companion object {
        fun to(yaml: Config) : UtilData {
            val scenes = SceneTranslator.to(yaml)
            return UtilData(yaml.unity.applicationName, yaml.unity.outDir, scenes)
        }
    }
}