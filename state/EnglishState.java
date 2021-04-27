import java.util.ArrayList;

public class EnglishState implements State {
    private MusicBox box;

    public EnglishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> starLyrics = new ArrayList();
        starLyrics.add("Twinkle twinkle little star");
        starLyrics.add("How I wonder what you are");
        starLyrics.add("Up above the world so high");
        starLyrics.add("Like a dimond in the sky");
        starLyrics.add("Twinkle twinkle little star");
        starLyrics.add("How I wonder what you are");
        box.playSong("Twinkle Twinkle Little Star", starLyrics);
    }

    public void pressHappyButton() {

    }

    public void pressEnglishButton() {

    }

    public void pressFrenchButton() {

    }

    public void pressSpanishButton() {

    }
}
