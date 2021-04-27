public class LanguageSongs {
    public LanguageSongs() {
    }

    public void run() {
        MusicBox box = new MusicBox();
        box.pressStarButton();
    }

    public static void main(String[] args) {
        LanguageSongs driver = new LanguageSongs();
        driver.run();
    }
}
