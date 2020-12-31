import com.ibm.icu.text.Transliterator

class Romaji(object):
    """ generated source for class Romaji """
    @classmethod
    def hiraganize(cls, text):
        """ generated source for method hiraganize """
        return Transliterator.getInstance("Latin-Hiragana").transliterate(text)

    @classmethod
    def romanize(cls, text):
        """ generated source for method romanize """
        return Transliterator.getInstance("Hiragana-Latin").transliterate(text)