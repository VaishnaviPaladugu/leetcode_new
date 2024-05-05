package com.vaishnavi.study.dsAndAlgo.Queue;

public class Main {
    public static void main(String args[]) {
//        Queue myQueue = new Queue(1);
////        myQueue.enQueue(2);
////        myQueue.enQueue(3);
////        myQueue.enQueue(4);
//        myQueue.deQueue();
//        myQueue.printQueue();
        Queue myQueue = new Queue(2);
        myQueue.enQueue(1);

        // (2) Items - Returns 2 Node
        System.out.println(myQueue.deQueue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.deQueue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.deQueue());
    }
}
