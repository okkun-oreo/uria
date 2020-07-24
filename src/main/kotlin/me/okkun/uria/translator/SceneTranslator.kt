package me.okkun.uria.translator

import me.okkun.uria.data.entity.Config
import me.okkun.uria.domain.model.SceneData

class SceneTranslator {
    companion object {
        fun to(yaml : Config) : List<SceneData> {
            val scenes = yaml.unity.scenes ?: return listOf()
            val mtList = mutableListOf<SceneData>()
            for (scene in scenes) {
                mtList.add(SceneData(yaml.unity.applicationName, scene.name, scene.description))
            }
            return mtList
        }
    }
}