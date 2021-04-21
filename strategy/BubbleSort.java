import java.util.ArrayList;

public class BubbleSort implements SortBehavior {
    
    public ArrayList<String> sort(ArrayList<String> data){
        String temp = "";

        for(int i=0; i < data.size(); i++) {
            for(int j=1; j < (data.size() - i); j++) {
                if(data.get(j-1).compareTo(data.get(j)) > 0) {
                    temp = data.get(j-1);
                    data.set(j-1,data.get(j));
                    data.set(j,temp);
                }

            }
        }

        return data;
    }
}
