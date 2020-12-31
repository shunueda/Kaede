package me.kotlia;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Kanji {
    public static String encodeURIComponent(String str) {
        return URLEncoder.encode(str, StandardCharsets.UTF_8);
    }
    public static KanjiComponent toKanji(String str) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder(
                        URI.create(
                                "http://www.google.com/transliterate?langpair="+encodeURIComponent("ja-Hira|ja")+"&text=" + encodeURIComponent(str)
                        )
                )
                .build();
        return new KanjiComponent(
                HttpClient
                        .newBuilder()
                        .build()
                        .send(
                                request,
                                HttpResponse
                                        .BodyHandlers
                                        .ofString(StandardCharsets.UTF_8)
                        ).body()
        );
    }
}
