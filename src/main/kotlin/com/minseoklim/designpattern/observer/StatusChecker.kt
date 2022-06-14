package com.minseoklim.designpattern.observer

import org.slf4j.LoggerFactory

class StatusChecker : StatusSubject() {
    var errorCount = 0
    private val logger = LoggerFactory.getLogger(this::class.java)

    companion object {
        private const val ERROR_LIMIT = 10
    }

    fun check() {
        val status = loadStatus()
        logger.info("status : $status")

        if (status.isNotOk()) {
            if (status.isError()) {
                errorCount++
            }

            super.notifyStatus(status)
        } else {
            errorCount = 0
        }
    }

    fun exceedErrorLimit(): Boolean {
        return errorCount > ERROR_LIMIT
    }

    private fun loadStatus(): Status {
//        return Status.values()[Random.nextInt(0, 3)]
        return Status.INTERNAL_SERVER_ERROR
    }
}
