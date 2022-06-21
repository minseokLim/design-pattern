package com.minseoklim.designpattern.composite

class DeviceGroup(
    private val devices: MutableCollection<Device>
) : Device {
    constructor(vararg device: Device) : this(device.toMutableList())

    override fun turnOn() {
        devices.forEach {
            it.turnOn()
        }
    }

    override fun turnOff() {
        devices.forEach {
            it.turnOff()
        }
    }

    override fun addDevice(device: Device) {
        devices.add(device)
    }

    override fun removeDevice(device: Device) {
        devices.remove(device)
    }

    override fun canContain(device: Device): Boolean {
        return true
    }
}
