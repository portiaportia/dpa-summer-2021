import java.util.Iterator;

public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
    private int position = 0;

    public ExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
    }
    @Override
    public boolean hasNext() {
        return position < exercises.length && exercises[position] != null;
    }

    @Override
    public Exercise next() {
        if(!hasNext()) return null;
        return exercises[position++];
    }
    
}
