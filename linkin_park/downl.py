class Donwloader:
    def __init__(self):
        pass

    def download(self, music):
        music_url = __find_music_url(music)
        if music_url is None:
            print("Não foi possível baixar as músicas do linkin park :[")
            print("Mas gostaria de ouvir a palavra do Sr. Linux 🙏?")
            return
            # método implementado com sucesso
    def __find_music(self, music):
        return None

def main() -> None:
    downl = Donwloader()

if __name__ == "__main__":
    main()
