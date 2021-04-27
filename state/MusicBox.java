import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;

    private State state;

    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new EnglishState(this);
        spanishState = new EnglishState(this);

        state = englishState;
        System.out.println("Starting up the Music Box");
    }

    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    public void pressStarButton() {
        state.pressStarButton();
    }

    public void pressHappyButton() {
        state.pressHappyButton();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEnglishState() {
        return englishState;
    }

    public State getFrenchState() {
        return frenchState;
    }

    public State getSpanishState() {
        return spanishState;
    }

    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Playing: " + songName);
        for (String line : lyrics) {
            sleep();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(line);
        }
    }

    private void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
}
