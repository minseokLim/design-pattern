package com.minseoklim.designpattern.observer

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class StatusCheckerTest {

    @Test
    fun check() {
        assertDoesNotThrow {
            val statusChecker = StatusChecker()
            statusChecker.add(StatusEmailSender())
            statusChecker.add(StatusSmsSender())
            statusChecker.add(ErrorStatusSmsSender())

            statusChecker.check()
        }
    }
}
