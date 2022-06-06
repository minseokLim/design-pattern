package com.minseoklim.designpattern.strategy

class NonFreshItemDiscountStrategy : DiscountStrategy {
    override fun getDiscountPrice(item: Item): Int {
        return (item.price * 0.8).toInt()
    }
}
