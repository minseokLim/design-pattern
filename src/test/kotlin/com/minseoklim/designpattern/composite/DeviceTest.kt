package com.minseoklim.designpattern.composite

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

internal class DeviceTest {
    @Test
    fun test1() {
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

    @Test
    fun test2() {
        val airConditioner = AirConditioner()
        val light = Light()

        assertThrows<UnsupportedOperationException> {
            airConditioner.addDevice(light)
        }
        assertThat(airConditioner.canContain(light)).isFalse

        val deviceGroup: Device = DeviceGroup(airConditioner, light)
        val elevator = Elevator()
        assertDoesNotThrow {
            deviceGroup.addDevice(elevator)
        }
        assertThat(deviceGroup.canContain(elevator)).isTrue
    }
}
