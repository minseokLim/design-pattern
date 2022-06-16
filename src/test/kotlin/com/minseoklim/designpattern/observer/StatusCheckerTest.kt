package com.minseoklim.designpattern.observer

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test

internal class StatusCheckerTest {

    @Test
    fun check() {
        assertDoesNotThrow {
            val statusChecker = StatusChecker()
//            statusChecker.add(StatusEmailSender())
//            statusChecker.add(StatusSmsSender())
//            statusChecker.add(ErrorStatusSmsSender())
            statusChecker.add(EmergencyStatusSender(statusChecker))

            repeat(20) {
                statusChecker.check()
            }
        }
    }

    @Test
    fun 주제객체를_사용하는_외부코드에서_통지기능_실행() {
        assertDoesNotThrow {
            val checker1 = StatusChecker().apply { this.add(StatusEmailSender()) }
            val checker2 = StatusChecker().apply { this.add(StatusEmailSender()) }

            val lastStatus1 = checker1.check()
            val lastStatus2 = checker2.check()

            if (checker1.exceedErrorLimit() && checker2.exceedErrorLimit()) {
                checker1.notifyStatus(lastStatus1)
                checker2.notifyStatus(lastStatus2)
            }
        }
    }
}
