package com.minseoklim.designpattern.decorator

import org.slf4j.LoggerFactory

class FileOutImpl : FileOut {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun write(data: ByteArray) {
        logger.info(String(data))
    }
}
