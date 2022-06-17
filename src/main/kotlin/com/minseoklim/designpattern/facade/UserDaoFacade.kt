package com.minseoklim.designpattern.facade

interface UserDaoFacade {
    fun findById(id: Int): User
}
