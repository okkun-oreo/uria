package me.okkun.uria.data.entity

import kotlinx.serialization.Serializable

@Serializable
data class SceneEntity(
        val name: String,
        val description: String,
        val usecases: List<String>
)