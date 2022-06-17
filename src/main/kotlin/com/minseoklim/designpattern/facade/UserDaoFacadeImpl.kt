package com.minseoklim.designpattern.facade

class UserDaoFacadeImpl(
    private val ageDao: AgeDao,
    private val nameDao: NameDao,
    private val genderDao: GenderDao
) : UserDaoFacade {
    override fun findById(id: Int): User {
        val age = ageDao.findById(id)
        val name = nameDao.findById(id)
        val gender = genderDao.findById(id)

        return User(id, name, gender, age)
    }
}
