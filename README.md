# Kanade - Japanese Transliteration Library

## 日本語
* **Kanade** は日本語変換を目的とされたライブラリです。
* ローマ字 <-> 平仮名 -> 漢字 の変換を行えます。
* 平仮名・漢字変換は Google CGI API for Japanese Input を使用しています。
* 漢字 -> 平仮名の変換は Yuichi Sugimura様の [Kanhira](https://gitlab.com/ysugimura/kanhira) をご使用下さい。

## English
* **Kanade** is a library designed for Japanese conversion.
* It can convert Japanese characters from romaji <-> hiragana -> kanji.
* Hiragana/kanji conversion is done using Google CGI API for Japanese Input.
* For kanji -> hiragana conversion, please use Yuichi Sugimura's [Kanhira](https://gitlab.com/ysugimura/kanhira).

## Example
### Code
```kotlin
import me.kotlia.Kanade
fun main() {
    println(
        Kanade
            .kanji
            .toKanji("こんにちはせかい！きょうはいいてんきですね。")
            .format()
    )
}
```
### Output
```text
こんにちは世界！今日はいい天気ですね。
```