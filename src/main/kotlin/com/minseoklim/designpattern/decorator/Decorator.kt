package com.minseoklim.designpattern.decorator

abstract class Decorator(
    private val delegate: FileOut
) : FileOut {
    protected fun doDelegate(data: ByteArray) {
        delegate.write(data)
    }
}
