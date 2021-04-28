import java.util.ArrayList;

public class SpanishState implements State {
    private MusicBox box;

    public SpanishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> starLyrics = new ArrayList();
        starLyrics.add("Estrellita, ¿dónde estás?");
        starLyrics.add("Quiero verte cintilar");
        starLyrics.add("En el cielo, sobre el mar.");
        starLyrics.add("Un diamante de verdad.");
        starLyrics.add("Estrellita, ¿dónde estás?");
        starLyrics.add("Quiero verte cintilar.");
        box.playSong("Estrellita, ¿Dónde Estás?", starLyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> starLyrics = new ArrayList();
        starLyrics.add("Si usted esta feliz Apaluda las fuerte.");
        starLyrics.add("Si usted esta feliz Apaluda las fuerte.");
        starLyrics.add("Si usted esta feliz ");
        starLyrics.add("En su cara se vera. ");
        starLyrics.add("Si usted esta feliz ");
        starLyrics.add("Apaluda las fuerte.  ");
        box.playSong("Si Usted Esta Feliz", starLyrics);
    }

    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }

    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("You are already in Spanish Mode");
    }
}
