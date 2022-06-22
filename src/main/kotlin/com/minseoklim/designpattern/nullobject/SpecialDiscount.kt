package com.minseoklim.designpattern.nullobject

interface SpecialDiscount {
    fun discount(price: Price)
}

class VipSpecialDiscount : SpecialDiscount {
    override fun discount(price: Price) {
        price.multiply(0.9)
    }
}

class DormantSpecialDiscount : SpecialDiscount {
    override fun discount(price: Price) {
        price.multiply(0.8)
    }
}

class NullSpecialDiscount : SpecialDiscount {
    override fun discount(price: Price) {
        // do nothing
    }
}
