import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {
	private ArrayList<Observer> observers;
	private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

	public StudentGovPoll(String school) {
        this.school = school;
		observers = new ArrayList<Observer>();
        votes = new HashMap();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(votes);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	

	public void addCandidate(String president){
		president = president.toLowerCase().trim();

        if(votes.containsKey(president)) return;

		votes.put(president, 0);
	}

    public void enterVotes(String president, int num) {
        president = president.toLowerCase().trim();

        if(!votes.containsKey(president)) return;
        
        Integer numVotes = votes.get(president) + num;
        votes.put(president,numVotes);
        numUpdates ++;
        
        if(numUpdates % 4 == 0) {
            notifyObservers();
        }

    }

    public String getSchool() {
        return school;
    }
}