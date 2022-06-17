package com.minseoklim.designpattern.facade

class NameDao {
    private val database = mapOf(1 to "임민석", 2 to "수지")

    fun findById(id: Int): String {
        return database[id] ?: throw IllegalArgumentException()
    }
}
