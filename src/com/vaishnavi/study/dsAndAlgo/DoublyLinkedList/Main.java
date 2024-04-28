package com.vaishnavi.study.dsAndAlgo.DoublyLinkedList;

public class Main {
    public static void main(String args[]) {
        DoublyLinkedLIst myDll = new DoublyLinkedLIst(7);
        myDll.append(2);
        myDll.append(3);
        myDll.append(5);
        myDll.printList();
        myDll.swapPairs();
        System.out.println("______________");
        myDll.printList();

    }
}
