package Week1.DataStructure;

import java.util.*;

public class ObjectAddingToQueue {
    public static void main(String[] args) {
        Queue<people> queue = new ArrayDeque<>();
        queue.offer(new people(1,"John"));
        queue.offer(new people(2,"Josh"));
        Iterator<people> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
