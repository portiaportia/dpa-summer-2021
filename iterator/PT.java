import java.util.ArrayList;
import java.util.Iterator;

public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    int numItems = 0;

    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;    
        exercises = new Exercise[2];
    }

    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        Exercise exercise = new Exercise(title, muscleGroups, directions);

        if(numItems == exercises.length - 1) {
            exercises = growArray(exercises);
        }

        exercises[numItems] = exercise;
        numItems++;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }

    private Exercise[] growArray(Exercise[] exercises){
        Exercise[] temp = new Exercise[exercises.length * 2];

        for(int i = 0; i < exercises.length; i++){
            temp[i] = exercises[i];
        }

        return temp;
    }

    public ExerciseIterator createIterator() {
		return new ExerciseIterator(exercises);
	}

    public String toString(){
        return firstName + " " + lastName + "\n" + bio + "\n";
    }
}