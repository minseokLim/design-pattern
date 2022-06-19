package com.minseoklim.designpattern.composite

class DeviceRepository {
    private val devices = mutableMapOf<Int, Device>()

    fun save(device: Device): Int {
        val lastUsedId = devices.keys.maxOrNull() ?: 0
        val id = lastUsedId + 1
        devices[id] = device
        return id
    }

    fun findById(id: Int): Device {
        return devices[id] ?: throw IllegalArgumentException()
    }
}
