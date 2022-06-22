package com.minseoklim.designpattern.nullobject

data class Price(
    private var value: Int
) {
    fun multiply(rate: Double) {
        value = (value * rate).toInt()
    }
}
