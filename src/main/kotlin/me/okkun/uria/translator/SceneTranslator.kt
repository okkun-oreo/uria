package me.okkun.uria.translator

import me.okkun.uria.data.entity.Config
import me.okkun.uria.domain.model.SceneData
import me.okkun.uria.domain.model.UseCaseData

class SceneTranslator {
    companion object {
        fun to(yaml : Config) : List<SceneData> {
            val scenes = yaml.unity.scenes ?: return listOf()
            val mtList = mutableListOf<SceneData>()
            for (scene in scenes) {
                mtList.add(SceneData(yaml.unity.applicationName, yaml.unity.outDir, scene.name, scene.description, scene.usecases))
            }
            return mtList
        }

        fun toUseCase(yaml: Config) : List<UseCaseData> {
            val scenes = yaml.unity.scenes ?: return listOf()
            val mtList = mutableListOf<UseCaseData>()
            for (scene in scenes) {
                for (useCaseName in scene.usecases) {
                    mtList.add(UseCaseData(yaml.unity.applicationName, useCaseName))
                }
            }
            return mtList
        }
    }
}