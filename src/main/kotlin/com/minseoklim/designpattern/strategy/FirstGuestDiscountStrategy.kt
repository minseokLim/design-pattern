package com.minseoklim.designpattern.strategy

class FirstGuestDiscountStrategy : DiscountStrategy {
    override fun getDiscountPrice(item: Item): Int {
        return (item.price * 0.9).toInt()
    }
}
