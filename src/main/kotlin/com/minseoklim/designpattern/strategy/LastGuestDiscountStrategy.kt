package com.minseoklim.designpattern.strategy

class LastGuestDiscountStrategy : DiscountStrategy {
    override fun getDiscountPrice(item: Item): Int {
        return (item.price * 0.5).toInt()
    }
}
