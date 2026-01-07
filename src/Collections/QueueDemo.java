package Collections;

import java.util.*;

public class QueueDemo {
    //used for scheduling
    //
    //priorityQueue --- priority based
    //ArrayDeque ----faster than stack
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        //Linkedlist implements list,Deque and Queue, So it act as FIFO
        queue.offer("Task1");
        queue.offer("task2");
        queue.offer("Task3");
        System.out.println("Queue: "+queue);
        System.out.println("Peek (Without removing): "+queue.peek());
        System.out.println("Poll (remove and return) "+queue.poll());
        System.out.println("After poll : "+queue);

        //priorityQueue - ordered by natural ordering comparator
        Queue<Integer> priorityQueue =new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        System.out.println("PriorityQueue : "+ priorityQueue);
        System.out.println("Polling in priority order : ");
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll()+" ");
        }
        System.out.println();

        // Deque - double-ended queue (can act as stack or queue)
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.addFirst("New Front");
        System.out.println("Deque: " + deque);
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());

// Using Deque as Stack (LIFO)
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
    }
}
