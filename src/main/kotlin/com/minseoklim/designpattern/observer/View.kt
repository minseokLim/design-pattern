package com.minseoklim.designpattern.observer

sealed class View {
    private val onClickListeners = mutableListOf<OnClickListener>()
    private val onScrollListeners = mutableListOf<OnScrollListener>()

    fun setOnClickListener(onClickListener: OnClickListener) {
        onClickListeners.add(onClickListener)
    }

    fun click() {
        onClickListeners.forEach {
            it.onClick(this)
        }
    }

    fun setOnScrollListener(onScrollListener: OnScrollListener) {
        onScrollListeners.add(onScrollListener)
    }

    fun scroll() {
        onScrollListeners.forEach {
            it.onScroll(this)
        }
    }

    class Button : View()
    class Image : View()

    fun interface OnClickListener {
        fun onClick(view: View)
    }

    fun interface OnScrollListener {
        fun onScroll(view: View)
    }
}
