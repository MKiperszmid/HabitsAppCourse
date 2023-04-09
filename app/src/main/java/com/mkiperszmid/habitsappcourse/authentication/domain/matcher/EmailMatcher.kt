package com.mkiperszmid.habitsappcourse.authentication.domain.matcher

interface EmailMatcher {
    fun isValid(email: String): Boolean
}