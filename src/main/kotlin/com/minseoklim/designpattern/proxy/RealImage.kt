package com.minseoklim.designpattern.proxy

import org.slf4j.LoggerFactory

class RealImage(
    private val path: String
) : Image {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun draw() {
        logger.info("Image is loaded on [$path]")
    }
}
