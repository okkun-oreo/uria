package me.okkun.uria.data.entity

import kotlinx.serialization.Serializable

@Serializable
data class UnityEntity(
        val applicationName: String,
        val scenes: List<SceneEntity>?,
        val masters: List<MasterDataEntity>?
)