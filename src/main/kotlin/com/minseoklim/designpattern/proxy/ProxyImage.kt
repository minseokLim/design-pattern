package com.minseoklim.designpattern.proxy

class ProxyImage(
    private val path: String
) : Image {
    private var image: Image? = null

    override fun draw() {
        val image = this.image ?: RealImage(path)
        image.draw()
    }
}
