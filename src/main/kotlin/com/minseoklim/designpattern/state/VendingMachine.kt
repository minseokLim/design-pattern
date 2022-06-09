package com.minseoklim.designpattern.state

class VendingMachine {
    private var state = State.NO_COIN
    private val coin = Coin()
    private val products = listOf(Product(1, "콜라"), Product(2, "사이다")).associateBy { it.id }.toMutableMap()

    fun insertCoin(coin: Int) {
        state.insertCoin(coin, this)
    }

    fun select(productId: Int) {
        state.select(productId, this)
    }

    fun changeState(state: State) {
        this.state = state
    }

    fun provideProduct(productId: Int) {
        products.remove(productId)
    }

    fun increaseCoin(increment: Int) {
        coin += increment
    }

    fun decreaseCoin() {
        coin -= 1
    }

    fun hasNoProducts(): Boolean {
        return products.isEmpty()
    }

    fun hasNoCoin(): Boolean {
        return coin.isZero()
    }
}
