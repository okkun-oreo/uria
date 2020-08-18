package me.okkun.uria.domain.model

data class MasterData(
        val applicationName: String,
        val name: String,
        val props: List<PropertyData>
)