package me.kotlia

import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.charset.StandardCharsets

object Kanji {
    fun encodeURIComponent(str: String): String {
        return URLEncoder.encode(str, "UTF-8")
    }
    fun toKanji(str: String): KanjiComponent {
        val request = HttpRequest
            .newBuilder(
                URI.create(
                    "http://www.google.com/transliterate?langpair=${encodeURIComponent("ja-Hira|ja")}&text=${
                        encodeURIComponent(
                            str
                        )
                    }"
                )
            )
            .build()
        return KanjiComponent(
            HttpClient
                .newBuilder()
                .build()
                .send(
                    request,
                    HttpResponse
                        .BodyHandlers
                        .ofString(StandardCharsets.UTF_8)
                ).body()
        )
    }
}