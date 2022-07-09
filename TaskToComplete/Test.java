package Week1.TaskToComplete;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Number01_Duplicate duplicate = new Number01_Duplicate();
        ArrayList<String> listOfNum1 = new ArrayList<>(List.of("adfdsa","Hello","new","new","new","Hello"));
        System.out.println(duplicate.duplicate(listOfNum1));


        Number02_Common common = new Number02_Common();
        ArrayList<String> num1 = new ArrayList<>(List.of("a","b","c","new"));
        ArrayList<String> num2 = new ArrayList<>(List.of("a","d","c","new","c"));
        System.out.println(common.common(num1,num2));

        Number03_Average average = new Number03_Average();
        System.out.println(average.average(2,3,5));

        Number04_Leap leap = new Number04_Leap();
        System.out.println(leap.check(2020));
    }
}
