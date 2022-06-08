package com.minseoklim.designpattern.templatemethod.strategy

import org.slf4j.LoggerFactory

class Apple : Fruit {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun eaten() {
        logger.info("Apple is eaten")
    }
}
