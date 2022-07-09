package Week1.DataStructure;

import java.util.*;

public class SpecialQueue01 {
    Queue<Integer> q;
    Deque<Integer> dq;

    public SpecialQueue01(){
        q = new LinkedList<>();
        dq = new ArrayDeque<>();
    }

    void enque(int data){
        // remove all elements from
        // from deque which are greater
        // than the current element 'data'
        while(!dq.isEmpty() && dq.getLast() > data){
            dq.removeLast();
        }
        // If queue is empty then
        // while loop is skipped.
        dq.addLast(data);
        q.add(data);
        int count=0;
        for (Integer i : dq){
            count++;
            System.out.println(count + " " + i);
        }
    }

    void deque(){
        // If min element is present
        // at front of queue
        if(dq.getFirst() == q.peek()){
            dq.removeFirst();
        }
        q.remove();
    }

    // Method to get min element in Queue
    int getMin() throws Exception{
        // If queue is Empty, return Exception
        if(q.isEmpty())
            throw new Exception("Queue is Empty");
        else
            return dq.getFirst();
    }
    public static void main(String[] args) throws Exception {
        SpecialQueue01 arr = new SpecialQueue01();
        arr.enque(40);
        arr.enque(50);
        arr.enque(100);
        arr.enque(200);
        arr.enque(40);
        System.out.println(arr.getMin());
        arr.deque();
        System.out.println(arr.getMin());
    }

}
