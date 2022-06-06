package com.minseoklim.designpattern.strategy

interface DiscountStrategy {
    fun getDiscountPrice(item: Item): Int
}
