import me.kotlia.Romaji

class Kaede(object):
    romaji = Romaji()
    kanji = Kanji()

    @classmethod
    def main(cls, args):
        print Kaede.romaji

if __name__ == '__main__':
    import sys
    Kaede.main(sys.argv)