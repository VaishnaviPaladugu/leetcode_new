package com.vaishnavi.study.dsAndAlgo.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode() {
        int length = getLength();
        int mid = length/2;
        Node temp = head;
        for(int i = 0 ; i < mid ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getLength() {
        if(head == null) return 0;
        int len = 1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    public boolean hasLoop() {
        if(head == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    public Node findKthFromEnd(int k) {
        Node curr = head;
        Node kthCurr = head;
        for(int i = 0 ; i <= k ; i++) {
            if(kthCurr.next != null)
            {
                kthCurr = kthCurr.next;
            }
            else
                return null;
        }
        while(kthCurr.next != null) {
            curr = curr.next;
            kthCurr = kthCurr.next;
        }
            return curr;
    }
}
