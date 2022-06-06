package com.minseoklim.designpattern.strategy

import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    fun calculate() {
        val items = listOf(Item("사과", 300), Item("포도", 700))

        assert(Calculator(FirstGuestDiscountStrategy()).calculate(items) == 900)
        assert(Calculator(NonFreshItemDiscountStrategy()).calculate(items) == 800)
        assert(Calculator(LastGuestDiscountStrategy()).calculate(items) == 500)
    }
}
