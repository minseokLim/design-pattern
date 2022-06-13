package com.minseoklim.designpattern.observer

enum class Status {
    OK, BAD_REQUEST, INTERNAL_SERVER_ERROR;

    fun isNotOk(): Boolean {
        return this != OK
    }

    fun isError(): Boolean {
        return this == INTERNAL_SERVER_ERROR
    }
}
