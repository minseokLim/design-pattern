package com.minseoklim.designpattern.state

data class Coin(
    var value: Int = 0
) {
    init {
        validate(value)
    }

    operator fun plusAssign(increment: Int) {
        validate(increment)
        this.value += increment
    }

    operator fun minusAssign(decrement: Int) {
        validate(decrement)
        this.value -= decrement
        validate(value)
    }

    fun isZero(): Boolean {
        return value == 0
    }

    private fun validate(value: Int) {
        if (value <= 0) {
            throw IllegalArgumentException("코인의 값은 양수여야 합니다")
        }
    }
}
