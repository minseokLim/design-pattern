package com.minseoklim.designpattern.templatemethod

abstract class Authenticator {
    fun authenticate(id: String, pw: String): Auth {
        if (!doAuthenticate(id, pw)) {
            throw IllegalArgumentException()
        }
        return createAuth(id)
    }

    protected abstract fun doAuthenticate(id: String, pw: String): Boolean

    protected abstract fun createAuth(id: String): Auth
}
