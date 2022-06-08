package com.minseoklim.designpattern.templatemethod.strategy

import org.slf4j.LoggerFactory

class FruitEater {
    private val logger = LoggerFactory.getLogger(this::class.java)

    fun eat(fruit: Fruit) {
        logger.info("FruitEater.eat started")
        fruit.eaten()
        logger.info("FruitEater.eat ended")
    }
}
