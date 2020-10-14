package me.okkun.uria.utils.cli

import me.okkun.uria.utils.exception.ErrorCode
import me.okkun.uria.utils.exception.UriaException
import sun.rmi.runtime.Log
import java.nio.file.Paths

class Env {

  companion object {
    private const val UNITY_PATH_KEY = "UNITY_APPLICATION_PATH"
    fun getUnityPath() : String {
      return getEnv(UNITY_PATH_KEY)
    }

    fun getWorkingDir() : String {
      val relativePath = Paths.get("")
      return relativePath.toAbsolutePath().toString()
    }

    private fun getEnv(key: String) : String {
      try {
        return System.getenv(key)
      } catch (e: NullPointerException) {
        throw UriaException(ErrorCode.E1005)
      }
    }
  }

}