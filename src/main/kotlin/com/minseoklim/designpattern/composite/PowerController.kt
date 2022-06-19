package com.minseoklim.designpattern.composite

class PowerController(
    private val deviceRepository: DeviceRepository
) {
    fun turnOn(id: Int) {
        val device = deviceRepository.findById(id)
        device.turnOn()
    }

    fun turnOff(id: Int) {
        val device = deviceRepository.findById(id)
        device.turnOff()
    }
}
