package me.okkun.uria.utils.cli

import me.okkun.uria.utils.exception.ErrorCode
import me.okkun.uria.utils.exception.UriaException

class Command(command: String?) {
  private val command: String

  init {
    if (command.isNullOrEmpty()) {
      throw UriaException(ErrorCode.E1001)
    }
    this.command = command
  }


  fun getType() : CommandType {
    when(command) {
      "add" -> {
        return CommandType.ADD
      }
      "make" -> {
        return CommandType.MAKE
      }
      "init" -> {
        return CommandType.INIT
      }
    }
    throw UriaException(ErrorCode.E1001)
  }



}