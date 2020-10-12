package me.okkun.uria.utils.cli

class InputReader {

  fun question(message: String) : String {
    print("${message}: ")
    val response = readLine()
    if (response.isNullOrEmpty())
      return question(message)
    return response
  }

  fun question(message: String, list: Array<String>) : Int {
    list.forEachIndexed { index, value ->
      println("${index}: $value")
    }
    readLine()?.toIntOrNull()?.let { response ->
      if (0 <= response && response < list.size)
        return response
    }
    return question(message, list)
  }



}