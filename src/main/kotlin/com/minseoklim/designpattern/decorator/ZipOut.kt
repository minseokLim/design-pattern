package com.minseoklim.designpattern.decorator

class ZipOut(
    delegate: FileOut
) : Decorator(delegate) {
    override fun write(data: ByteArray) {
        val zippedData = zip(data)
        super.doDelegate(zippedData)
    }

    private fun zip(data: ByteArray): ByteArray {
        return "zipped ${String(data)}".toByteArray()
    }
}
