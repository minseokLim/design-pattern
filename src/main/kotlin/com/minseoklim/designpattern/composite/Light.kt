package com.minseoklim.designpattern.composite

import org.slf4j.LoggerFactory

class Light : Device {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun turnOn() {
        logger.info("${this::class.simpleName} is turned on")
    }

    override fun turnOff() {
        logger.info("${this::class.simpleName} is turned on")
    }
}
