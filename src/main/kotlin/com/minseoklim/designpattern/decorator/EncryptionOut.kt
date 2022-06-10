package com.minseoklim.designpattern.decorator

class EncryptionOut(
    delegate: FileOut
) : Decorator(delegate) {
    override fun write(data: ByteArray) {
        val encryptedData = encrypt(data)
        super.doDelegate(encryptedData)
    }

    private fun encrypt(data: ByteArray): ByteArray {
        return "encrypted ${String(data)}".toByteArray()
    }
}
