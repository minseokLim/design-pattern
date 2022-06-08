package com.minseoklim.designpattern.templatemethod.hook

import org.slf4j.LoggerFactory

abstract class Task {
    private val logger = LoggerFactory.getLogger(this::class.java)

    fun run() {
        logger.info("Task.run started")
        preExecute()
        execute()
        postExecute()
        logger.info("Task.run ended")
    }

    protected open fun preExecute() {}
    protected abstract fun execute()
    protected open fun postExecute() {}
}
