package com.minseoklim.designpattern.composite

class DeviceGroup(
    private val devices: Collection<Device>
) : Device {
    constructor(vararg device: Device) : this(device.toList())

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
}
