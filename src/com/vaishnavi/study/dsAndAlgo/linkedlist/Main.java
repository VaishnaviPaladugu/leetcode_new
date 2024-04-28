package com.vaishnavi.study.dsAndAlgo.linkedlist;

public class Main {
    public static void main(String args[])
    {
        LinkedList newList = new LinkedList(4);
        newList.append(2);
        newList.append(3);
        newList.append(1);
        newList.append(5);
        newList.findKthFromEnd(2);
    }
}
