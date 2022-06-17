package com.minseoklim.designpattern.facade

class GenderDao {
    private val database = mapOf(1 to "남", 2 to "여")

    fun findById(id: Int): String {
        return database[id] ?: throw IllegalArgumentException()
    }
}
