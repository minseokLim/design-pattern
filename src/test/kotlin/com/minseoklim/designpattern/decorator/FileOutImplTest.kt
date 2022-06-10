package com.minseoklim.designpattern.decorator

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test

internal class FileOutImplTest {

    @Test
    fun write() {
        assertDoesNotThrow {
            val delegate = FileOutImpl()
            val fileOut1 = EncryptionOut(delegate)
            fileOut1.write("테스트 데이터".toByteArray())

            val fileOut2 = EncryptionOut(ZipOut(delegate))
            fileOut2.write("테스트 데이터".toByteArray())

            val fileOut3 = BufferedOut(fileOut2)
            fileOut3.write("테스트 데이터".toByteArray())
        }
    }
}
