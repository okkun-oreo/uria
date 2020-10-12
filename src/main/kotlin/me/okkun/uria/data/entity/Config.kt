package me.okkun.uria.data.entity

import com.google.gson.annotations.SerializedName

data class Config(
  @SerializedName("unity")
  val unity: UnityEntity
)