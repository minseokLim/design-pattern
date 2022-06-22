package com.minseoklim.designpattern.nullobject

import com.minseoklim.designpattern.nullobject.Customer.Status.NORMAL
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerTest {
    @Test
    fun test() {
        val normalCustomer = Customer(NORMAL)
        val specialDiscount = normalCustomer.getSpecialDiscount()
        val price = Price(10000)
        specialDiscount.discount(price)

        assertThat(price).isEqualTo(Price(10000))
    }
}
