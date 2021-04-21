import java.util.HashMap;

public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    
    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }
    
    public void update(HashMap<String, Integer> votes){
        this.votes = votes;
        display();
    }

    private void display(){
        System.out.println("\nCurrent Tallies:");
        for(String president : votes.keySet()){
            System.out.println(toTitleCase(president) + ": " + votes.get(president));
        }
    }

    private String toTitleCase(String text){
        return text.substring(0,1).toUpperCase() + text.substring(1);
    }
}