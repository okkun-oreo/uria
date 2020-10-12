package me.okkun.uria.utils.exception

class UriaException(code: ErrorCode) : Exception(code.message) {
}