package com.mkiperszmid.authentication_domain.matcher

interface EmailMatcher {
    fun isValid(email: String): Boolean
}