package Week1.DataStructure;

import java.util.*;

public class DemoQueue {

    public static void main(String[] args) {
        // LinkedList
        System.out.println("LinkedList Queue");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue: "+queue);
        int removedInt = queue.poll();
        System.out.println("Removed Element: "+removedInt);
        System.out.println("Updated queue: "+queue);


        System.out.println();


        // PriorityQueue
        System.out.println("Priority queue");
        // Creating Queue using the PriorityQueue class
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        // offer elements to the Queue
        numbers.offer(4);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);
        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);
        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("Updated Queue: " + numbers);
        boolean result = numbers.remove(23);
        System.out.println(result);
        System.out.println("Updated Queue: " + numbers);
        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()){
            System.out.print(iterate.next()+", ");
        }
    }

}
