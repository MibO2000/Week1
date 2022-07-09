package Week1.DataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsBasic {
    public static void printArray(Collection<? extends Number> inputArray){
        for (Object element: inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create arrays of Integer, Double and Character
        ArrayList<Integer> intArrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(List.of(1.1,2.2,3.3,4.4,5.5));
//        ArrayList<Character> charArrayList = new ArrayList<>(List.of('H', 'E', 'L', 'L', 'O'));

        System.out.println("Array integerArray contains:");
        printArray(intArrayList);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArrayList);   // pass a Double array

//        System.out.println("\nArray characterArray contains:");
//        printArray(charArrayList);   // pass a Character array
    }
}
