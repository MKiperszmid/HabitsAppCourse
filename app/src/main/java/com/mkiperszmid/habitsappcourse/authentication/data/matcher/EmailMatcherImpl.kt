package com.mkiperszmid.habitsappcourse.authentication.data.matcher

import android.util.Patterns
import com.mkiperszmid.habitsappcourse.authentication.domain.matcher.EmailMatcher

class EmailMatcherImpl : EmailMatcher {
    override fun isValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}