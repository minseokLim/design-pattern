package com.minseoklim.designpattern.observer

import org.slf4j.LoggerFactory

class StatusSmsSender : StatusObserver {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun onAbnormalStatus(status: Status) {
        logger.info("sms is sent - status : $status")
    }
}
