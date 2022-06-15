package com.minseoklim.designpattern.observer

sealed class View {
    private val onClickListeners = mutableListOf<OnClickListener>()

    fun setOnClickListener(onClickListener: OnClickListener) {
        onClickListeners.add(onClickListener)
    }

    fun click() {
        onClickListeners.forEach {
            it.onClick(this)
        }
    }

    class Button : View()
    class Image : View()

    fun interface OnClickListener {
        fun onClick(view: View)
    }
}
