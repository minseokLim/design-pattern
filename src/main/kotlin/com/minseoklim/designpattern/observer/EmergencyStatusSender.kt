package com.minseoklim.designpattern.observer

import org.slf4j.LoggerFactory

class EmergencyStatusSender(
    private val statusChecker: StatusChecker
) : StatusObserver {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun onAbnormalStatus(status: Status) {
        if (statusChecker.exceedErrorLimit()) {
            logger.info("current status : $status")
            logger.info("error is occurring ${statusChecker.errorCount} times")
        }
    }
}
