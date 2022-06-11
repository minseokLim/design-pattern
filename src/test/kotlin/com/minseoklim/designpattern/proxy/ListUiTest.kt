package com.minseoklim.designpattern.proxy

import org.junit.jupiter.api.Test

internal class ListUiTest {

    @Test
    fun onScroll() {
        val images = mutableListOf<Image>()
        for (i in 0..10) {
            if (i <= 4) {
                images.add(RealImage("path$i"))
            } else {
                images.add(ProxyImage("path$i"))
            }
        }
        val listUi = ListUi(images)

        listUi.onScroll(0, 10)
    }
}
