package com.minseoklim.designpattern.facade

class AgeDao {
    private val database = mapOf(1 to 10, 2 to 11)

    fun findById(id: Int): Int {
        return database[id] ?: throw IllegalArgumentException()
    }
}
