package com.minseoklim.designpattern.nullobject

class Customer(
    private val status: Status
) {
    fun getSpecialDiscount(): SpecialDiscount {
        return status.specialDiscount
    }

    enum class Status(
        val specialDiscount: SpecialDiscount
    ) {
        DORMANT(DormantSpecialDiscount()),
        VIP(VipSpecialDiscount()),
        NORMAL(NullSpecialDiscount())
    }
}
