package com.minseoklim.designpattern.templatemethod.hook

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class TaskTest {

    @Test
    fun run() {
        assertDoesNotThrow {
            val task1 = object : Task() {
                private val logger = LoggerFactory.getLogger(this::class.java)

                override fun preExecute() {
                    logger.info("task1.preExecute")
                }

                override fun execute() {
                    logger.info("task1.execute")
                }
            }
            task1.run()

            val task2 = object : Task() {
                private val logger = LoggerFactory.getLogger(this::class.java)

                override fun execute() {
                    logger.info("task2.execute")
                }

                override fun postExecute() {
                    logger.info("task2.postExecute")
                }
            }
            task2.run()
        }
    }
}
