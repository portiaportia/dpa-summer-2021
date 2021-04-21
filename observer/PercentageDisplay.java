import java.text.DecimalFormat;
import java.util.HashMap;

public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;
    
    public PercentageDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }
    
    public void update(HashMap<String, Integer> votes){
        this.votes = votes;
        numVotes = getNumVotes();
        display();
    }

    private void display(){
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("\nCurrent Percent of Votes:");
        for(String president : votes.keySet()){
            double percentage = (float)votes.get(president) / numVotes * 100;
            System.out.println(toTitleCase(president) + ": " + df.format(percentage) + "%");
        }
    }

    private String toTitleCase(String text){
        return text.substring(0,1).toUpperCase() + text.substring(1);
    }

    private int getNumVotes(){
        int num = 0;

        for(String president : votes.keySet()){
            num += votes.get(president);
        }

        return num;
    }
}
