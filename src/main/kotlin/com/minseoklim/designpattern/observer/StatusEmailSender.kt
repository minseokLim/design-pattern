package com.minseoklim.designpattern.observer

import org.slf4j.LoggerFactory

class StatusEmailSender : StatusObserver {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun onAbnormalStatus(status: Status) {
        logger.info("email is sent - status : $status")
    }
}
