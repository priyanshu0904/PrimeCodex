package com.Collections.CollectionsLibrary.CollectionInterface.QueueInterface;

import com.Collections.CollectionsLibrary.CollectionInterface.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    //collection designed for holding elements prior to processing
    //it orders element in a FIFO manner, special case PriorityQueue
    //end points -> insertion(tail), removal(head)

    //LinkedList, PriorityQueue

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); //insert specified element into queue, throws exception if couldn't add
        queue.offer(2); //inserts the specified element into queue, returns false if couldn't added

        Utility.print(queue);

        System.out.println(queue.element()); //retrieves, but doesn't remove the head of queue throws exception if queue is empty
        System.out.println(queue.peek()); //retrieves, but doesn't remove the head of queue, returns null if queue is empty

        System.out.println(queue.remove()); //retrieves and remove the head of queue throws exception if queue is empty
        Utility.print(queue);
        System.out.println(queue.poll()); //retrieves and remove the head of queue, returns null if queue is empty
        Utility.print(queue);

        System.out.println(queue.poll());
        System.out.println(queue.remove());
    }
}
