package com.minseoklim.designpattern.templatemethod

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticatorTest {

    @Test
    fun authenticate() {
        val authenticator1: Authenticator = DbAuthenticator()
        val auth1 = authenticator1.authenticate("id", "pw")
        assertThat(auth1).isNotNull

        val authenticator2: Authenticator = LdapAuthenticator()
        val auth2 = authenticator2.authenticate("id", "pw")
        assertThat(auth2).isNotNull
    }
}
