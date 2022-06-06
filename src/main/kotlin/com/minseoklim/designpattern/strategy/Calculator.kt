package com.minseoklim.designpattern.strategy

class Calculator(
    private val discountStrategy: DiscountStrategy
) {
    fun calculate(items: Collection<Item>): Int {
        return items.sumOf { discountStrategy.getDiscountPrice(it) }
    }
}
