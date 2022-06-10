package com.minseoklim.designpattern.decorator

class BufferedOut(
    delegate: FileOut
) : Decorator(delegate) {
    override fun write(data: ByteArray) {
        val bufferedData = buffer(data)
        super.doDelegate(bufferedData)
    }

    private fun buffer(data: ByteArray): ByteArray {
        return "buffered ${String(data)}".toByteArray()
    }
}
