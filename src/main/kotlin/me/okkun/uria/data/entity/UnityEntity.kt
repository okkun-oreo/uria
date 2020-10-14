package me.okkun.uria.data.entity

import com.google.gson.annotations.SerializedName

data class UnityEntity(
  @SerializedName("application_name")
  val applicationName: String,
  @SerializedName("out_dir")
  val outDir: String,
  @SerializedName("scenes")
  val scenes: MutableList<SceneEntity>?
)