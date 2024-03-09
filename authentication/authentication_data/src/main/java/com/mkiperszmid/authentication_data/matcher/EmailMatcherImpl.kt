package com.mkiperszmid.authentication_data.matcher

import android.util.Patterns
import com.mkiperszmid.authentication_domain.matcher.EmailMatcher

class EmailMatcherImpl : EmailMatcher {
    override fun isValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}