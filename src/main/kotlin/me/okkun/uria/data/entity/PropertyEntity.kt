package me.okkun.uria.data.entity

import kotlinx.serialization.Serializable

@Serializable
data class PropertyEntity(
        val name: String,
        val type: String
)