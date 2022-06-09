package com.minseoklim.designpattern.state

enum class State {
    NO_COIN {
        override fun insertCoin(coin: Int, vm: VendingMachine) {
            vm.increaseCoin(coin)
            vm.changeState(SELECTABLE)
        }

        override fun select(productId: Int, vm: VendingMachine) {
            println("동전이 없습니다")
        }
    },
    SELECTABLE {
        override fun insertCoin(coin: Int, vm: VendingMachine) {
            vm.increaseCoin(coin)
        }

        override fun select(productId: Int, vm: VendingMachine) {
            vm.provideProduct(productId)
            vm.decreaseCoin()

            when {
                vm.hasNoProducts() -> vm.changeState(SOLD_OUT)
                vm.hasNoCoin() -> vm.changeState(NO_COIN)
            }
        }
    },
    SOLD_OUT {
        override fun insertCoin(coin: Int, vm: VendingMachine) {
            println("품절입니다")
        }

        override fun select(productId: Int, vm: VendingMachine) {
            println("품절입니다")
        }
    };

    abstract fun insertCoin(coin: Int, vm: VendingMachine)

    abstract fun select(productId: Int, vm: VendingMachine)
}
