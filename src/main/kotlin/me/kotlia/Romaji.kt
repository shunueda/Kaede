package me.kotlia

import com.ibm.icu.text.Transliterator

object Romaji {
    fun hiraganize(text: String): String {
        return Transliterator.getInstance("Latin-Hiragana").transliterate(text)
    }
    fun romanize(text: String): String {
        return Transliterator.getInstance("Hiragana-Latin").transliterate(text)
    }
}