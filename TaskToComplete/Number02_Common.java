package Week1.TaskToComplete;

import java.util.ArrayList;

public class Number02_Common {
    public ArrayList<String> common(ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> newList = new ArrayList<>();
        for (String aWord: a){
            for (String bWord: b){
                if (aWord.equals(bWord) && !newList.contains(aWord)){
                    newList.add(aWord);
                }
            }
        }
        return newList;
    }
}
