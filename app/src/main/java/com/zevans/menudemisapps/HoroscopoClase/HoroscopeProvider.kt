package com.zevans.menudemisapps.HoroscopoClase

import com.zevans.menudemisapps.R

class HoroscopeProvider {

    companion object {
        private val horoscopeList = listOf(
            Horoscope("aries",
                R.string.horoscope_name_aries,
                R.string.horoscope_date_aries,
                R.drawable.zodiac_aries
            ),
            Horoscope("taurus",
                R.string.horoscope_name_taurus,
                R.string.horoscope_date_taurus,
                R.drawable.zodiac_tauro
            ),
            Horoscope("gemini",
                R.string.horoscope_name_gemini,
                R.string.horoscope_date_gemini,
                R.drawable.zodiac_gemini
            ),
            Horoscope("cancer",
                R.string.horoscope_name_cancer,
                R.string.horoscope_date_cancer,
                R.drawable.zodiac_cancer
            ),
            Horoscope("leo",
                R.string.horoscope_name_leo,
                R.string.horoscope_date_leo,
                R.drawable.zodiac_leo
            ),
            Horoscope("virgo",
                R.string.horoscope_name_virgo,
                R.string.horoscope_date_virgo,
                R.drawable.zodiac_virgo
            ),
            Horoscope("libra",
                R.string.horoscope_name_libra,
                R.string.horoscope_date_libra,
                R.drawable.zodiac_libra
            ),
            Horoscope("scorpio",
                R.string.horoscope_name_scorpio,
                R.string.horoscope_date_scorpio,
                R.drawable.zodiac_scorpion
            ),
            Horoscope("sagittarius",
                R.string.horoscope_name_sagittarius,
                R.string.horoscope_date_sagittarius,
                R.drawable.zodiac_sagitario
            ),
            Horoscope("capricorn",
                R.string.horoscope_name_capricorn,
                R.string.horoscope_date_capricorn,
                R.drawable.zodiac_capricornio
            ),
            Horoscope("aquarius",
                R.string.horoscope_name_aquarius,
                R.string.horoscope_date_aquarius,
                R.drawable.zodiac_aquario
            ),
            Horoscope("pisces",
                R.string.horoscope_name_pisces,
                R.string.horoscope_date_pisces,
                R.drawable.zodiac_piscis
            )
        )

        fun getAll(): List<Horoscope> {
            return horoscopeList
        }

        fun getById(id: String): Horoscope? {
            return horoscopeList.find {
                it.id == id
            }
        }
    }
}