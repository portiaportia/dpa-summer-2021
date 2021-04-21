import java.util.ArrayList;

public class InsertionSort implements SortBehavior {
    
    public ArrayList<String> sort(ArrayList<String> data){
        String temp = "";

        for(int i=1; i < data.size(); i++) {
            temp = data.get(i);
            int j = i - 1;

            while( j >= 0 && data.get(j).compareTo(temp) > 0) {
                data.set(j+1, data.get(j));
                j = j - 1;
            }
            data.set(j+1, temp);
        }

        return data;
    }
    
}
