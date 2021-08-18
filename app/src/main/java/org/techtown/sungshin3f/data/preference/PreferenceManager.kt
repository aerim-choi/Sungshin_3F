package org.techtown.sungshin3f.data.preference

interface PreferenceManager {

    fun getString(key: String): String?

    fun putString(key: String, value: String)
}
