package com.minseoklim.designpattern.proxy

class ListUi(
    private val images: List<Image>
) {
    fun onScroll(start: Int, end: Int) {
        for (i in start..end) {
            images[i].draw()
        }
    }
}
