package me.okkun.uria.utils.exception

enum class ErrorCode(val message: String) {
  E1001("コマンドが見つかりませんでした"),
  E1002("既に初期化済みです"),
  E1003("初期化されていません")

}