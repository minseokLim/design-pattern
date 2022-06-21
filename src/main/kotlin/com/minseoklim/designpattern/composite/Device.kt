package com.minseoklim.designpattern.composite

interface Device {
    fun turnOn()
    fun turnOff()

    fun addDevice(device: Device) {
        throw UnsupportedOperationException()
    }

    fun removeDevice(device: Device) {
        throw UnsupportedOperationException()
    }

    fun canContain(device: Device): Boolean {
        return false
    }
}
