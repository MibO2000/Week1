package Week1.TaskToComplete;

import java.util.ArrayList;

public class Number01_Duplicate {

    public ArrayList<String> duplicate(ArrayList<String> a){
        ArrayList<String> newList = new ArrayList<>();
        int length = a.size();
        for (int i = 0; i < length; i++ ){
            String num1 = a.get(i);
            for (int j = i + 1; j < length; j++){
                if (num1.equals(a.get(j)) && !newList.contains(num1)){
                    newList.add(num1);
                }
            }
        }
        return newList;
    }

}
