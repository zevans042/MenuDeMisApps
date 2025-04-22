package com.zevans.menudemisapps.HoroscopoClase

import android.content.Context
import android.R

class SessionManager(context: Context) {
    private val sharedPref = context.getSharedPreferences("zodiak_session", Context.MODE_PRIVATE)

    fun setFavoriteHoroscope(id: String) {
        val editor = sharedPref.edit()
        editor.putString("FAVORITE_HOROSCOPE", id)
        editor.apply()
    }

    fun getFavoriteHoroscope(): String {
        return sharedPref.getString("FAVORITE_HOROSCOPE", "")!!
    }
}