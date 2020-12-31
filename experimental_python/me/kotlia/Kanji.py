# TODO

import java.io.IOException

import java.net.URI

import java.net.URLEncoder

import java.net.http.HttpClient

import java.net.http.HttpRequest

import java.net.http.HttpResponse

import java.nio.charset.StandardCharsets

class Kanji(object):
    """ generated source for class Kanji """
    @classmethod
    def encodeURIComponent(cls, str_):
        """ generated source for method encodeURIComponent """
        return URLEncoder.encode(str_, StandardCharsets.UTF_8)

    @classmethod
    def toKanji(cls, str_):
        """ generated source for method toKanji """
        request = HttpRequest.newBuilder(URI.create("http://www.google.com/transliterate?langpair=" + cls.encodeURIComponent("ja-Hira|ja") + "&text=" + cls.encodeURIComponent(str_))).build()
        return KanjiComponent(HttpClient.newBuilder().build().send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)).body())