package com.minseoklim.designpattern.observer

import com.minseoklim.designpattern.observer.View.Button
import com.minseoklim.designpattern.observer.View.Image
import com.minseoklim.designpattern.observer.View.OnClickListener
import org.junit.jupiter.api.Test

internal class ViewTest {

    @Test
    fun click() {
        val onClickListener = OnClickListener { view ->
            when (view) {
                is Button -> println("Button is clicked")
                is Image -> println("Image is clicked")
            }
        }

        val button = Button().apply { this.setOnClickListener(onClickListener) }
        val image = Image().apply { this.setOnClickListener(onClickListener) }

        button.click()
        image.click()
    }
}
