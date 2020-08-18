package me.okkun.uria.data.entity

import kotlinx.serialization.Serializable

@Serializable
data class DomainModelEntity(
        val name: String,
        val props: List<String>
)