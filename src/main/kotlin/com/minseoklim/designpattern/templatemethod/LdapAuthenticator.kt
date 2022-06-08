package com.minseoklim.designpattern.templatemethod

import org.slf4j.LoggerFactory

class LdapAuthenticator : Authenticator() {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun doAuthenticate(id: String, pw: String): Boolean {
        logger.info("LdapAuthenticator.doAuthenticate")
        return true
    }

    override fun createAuth(id: String): Auth {
        logger.info("LdapAuthenticator.createAuth")
        return Auth()
    }
}
