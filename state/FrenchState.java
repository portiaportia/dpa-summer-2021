import java.util.ArrayList;

public class FrenchState implements State {
    private MusicBox box;

    public FrenchState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> starLyrics = new ArrayList();
        starLyrics.add("Brille, brille, petite étoile,");
        starLyrics.add("Je me demande vraiment ce que tu es!");
        starLyrics.add("Au-dessus du monde si haut,");
        starLyrics.add("Comme un diamant dans le ciel.");
        starLyrics.add("Brille, brille, petite étoile,");
        starLyrics.add("Je me demande vraiment ce que tu es!");
        box.playSong("Brille, Brille, Petite Etoile", starLyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> starLyrics = new ArrayList();
        starLyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        starLyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        starLyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        starLyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        box.playSong("Si Tu as D' la Joie au Coeur", starLyrics);
    }

    public void pressEnglishButton() {
        System.out.println("Switching to English");
        System.out.println(box.getEnglishState());
    }

    public void pressFrenchButton() {
        System.out.println("You are already in French Mode");
    }

    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
