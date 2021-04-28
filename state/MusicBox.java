import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;

    private State state;

    public MusicBox() {
        System.out.println("Creating Our Music Box");
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);

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
        System.out.println("\nPlaying: " + songName);
        for (String line : lyrics) {
            sleep();
            System.out.println(line);
        }
        sleep();
        System.out.println();
    }

    private void clear() {
        System.out.print("\033[H\033[2J");
            System.out.flush();
    }

    private void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
}
