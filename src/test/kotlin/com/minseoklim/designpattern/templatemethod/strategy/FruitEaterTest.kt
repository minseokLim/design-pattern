package com.minseoklim.designpattern.templatemethod.strategy

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test

internal class FruitEaterTest {

    @Test
    fun eat() {
        assertDoesNotThrow {
            val fruitEater = FruitEater()
            fruitEater.eat(Apple())
            fruitEater.eat(Banana())
        }
    }
}
