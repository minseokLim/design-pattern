package com.minseoklim.designpattern.composite

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

internal class DeviceTest {
    @Test
    fun test() {
        assertDoesNotThrow {
            val airConditioner1 = AirConditioner()
            val light1 = Light()
            val elevator1 = Elevator()
            val deviceGroup1 = DeviceGroup(airConditioner1, light1, elevator1)

            val airConditioner2 = AirConditioner()
            val light2 = Light()
            val elevator2 = Elevator()
            val deviceGroup2 = DeviceGroup(airConditioner2, light2, elevator2)

            val totalDeviceGroup = DeviceGroup(deviceGroup1, deviceGroup2)

            airConditioner1.turnOn()
            println("------------------------------------------")
            deviceGroup1.turnOn()
            println("------------------------------------------")
            deviceGroup2.turnOn()
            println("------------------------------------------")
            totalDeviceGroup.turnOff()
        }
    }
}
