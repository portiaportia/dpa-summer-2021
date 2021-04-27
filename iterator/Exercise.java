import java.util.ArrayList;

public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;
    
    public Exercise(String title){
        this.title = title;
        targetMuscles = new ArrayList();
        directions = new ArrayList();
    }

    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }
    
    public void removeTargetMuscle(String muscle){
        targetMuscles.remove(muscle);
    }

    public String toString() {
        String result = "\n... " + title + " ...\n";
        result += "Muscles: " + getLineFormat(targetMuscles);
        result += "Exercises: \n" + getBulletFormat(targetMuscles);
        return result;
    }

    private String getLineFormat(ArrayList<String> data) {
        String result = "";

        for(int i = 0; i < data.size(); i++){
            result += data.get(i);
            if(i != data.size() - 1) result += ", ";
        }
        result += "\n";

        return result;
    }

    private String getBulletFormat(ArrayList<String> data) {
        String result = "";

        for(String item : data){
            result += "- " + item + "\n";
        }

        return result;
    }
}
