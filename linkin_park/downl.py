class Donwloader:
    def __init__(self):
        pass

    def download(self, music):
        music_url = __find_music_url(music)
        if music_url is None:
            print("não foi possível baixar as músicas do linkin park :[")
            return

    def __find_music(self, music):
        return None

def main() -> None:
    downl = Donwloader()

if __name__ == "__main__":
    main()
