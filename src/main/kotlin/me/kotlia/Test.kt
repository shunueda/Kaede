package me.kotlia

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        println(
            Kanade
                .kanji
                .toKanji("こんにちはせかい！きょうはいいてんきですね。")
                .format()
        ) // -> "こんにちは世界！今日はいい天気ですね。"
    }
}