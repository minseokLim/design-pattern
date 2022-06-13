package com.minseoklim.designpattern.observer

import org.slf4j.LoggerFactory

class ErrorStatusSmsSender : StatusObserver {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun onAbnormalStatus(status: Status) {
        if (status.isError()) {
            logger.info("sms is sent - status : $status")
        }
    }
}
