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
        ArrayList<String> starLyrics = new ArrayList();
        starLyrics.add("If you're happy and you know it clap your hands");
        starLyrics.add("If you're happy and you know it clap your hands");
        starLyrics.add("If you're happy and you know it, and you really want to show it");
        starLyrics.add("If you're happy and you know it clap your hands");
        box.playSong("If You're Happy and You Know it", starLyrics);
    }

    public void pressEnglishButton() {
        System.out.println("You are already in English Mode");
    }

    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
