package com.minseoklim.designpattern.observer

import org.slf4j.LoggerFactory
import kotlin.random.Random

class StatusChecker : StatusSubject() {
    private val logger = LoggerFactory.getLogger(this::class.java)

    fun check() {
        val status = loadStatus()
        logger.info("status : $status")

        if (status.isNotOk()) {
            super.notifyStatus(status)
        }
    }

    private fun loadStatus(): Status {
        return Status.values()[Random.nextInt(0, 3)]
    }
}
