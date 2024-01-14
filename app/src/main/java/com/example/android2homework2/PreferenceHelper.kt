package com.example.android2homework2

import android.content.Context

class PreferenceHelper(context: Context) {
    private val preference = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    var text: String
        set(value) {
            preference.edit().putString(TEXT_KEY, value).apply()
        }
        get() = preference.getString(TEXT_KEY, "") ?: ""

    var email: String
        set(value) {
            preference.edit().putString(EMAIL_KEY, value).apply()
        }
        get() = preference.getString(EMAIL_KEY, "") ?: ""

    var password: String
        set(value) {
            preference.edit().putString(PASSWORD_KEY, value).apply()
        }
        get() = preference.getString(PASSWORD_KEY, "") ?: ""


    companion object {
        const val PREFERENCE_NAME = "preference-name"
        const val TEXT_KEY = "text"
        const val EMAIL_KEY = "email"
        const val PASSWORD_KEY = "password"
    }
}