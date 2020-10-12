package me.okkun.uria.data.entity

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable
import java.util.*

data class SceneEntity(
  @SerializedName("name")
  val name: String,
  @SerializedName("description")
  val description: String,
  @SerializedName("usecases")
  val usecases: List<String>,
  @SerializedName("uuid")
  val uuid: String = UUID.randomUUID().toString()
)