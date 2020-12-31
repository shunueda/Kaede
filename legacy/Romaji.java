package me.kotlia;

import com.ibm.icu.text.Transliterator;

public class Romaji {
    public static String hiraganize(String text) {
        return Transliterator.getInstance("Latin-Hiragana").transliterate(text);
    }
    public static String romanize(String text) {
        return Transliterator.getInstance("Hiragana-Latin").transliterate(text);
    }
}
