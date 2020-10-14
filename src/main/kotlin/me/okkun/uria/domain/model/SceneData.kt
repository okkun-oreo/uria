package me.okkun.uria.domain.model

data class SceneData(
        val applicationName: String,
        val outDir: String,
        val sceneName: String,
        val description: String,
        val usecases: List<String>
)