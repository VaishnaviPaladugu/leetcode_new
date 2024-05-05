package com.vaishnavi.study.dsAndAlgo.Queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enQueue(int n) {
        if(last == null) {
            Node newNode = new Node(n);
            last = newNode;
            first = last;
            length = 1;
            return;
        }
        Node temp = new Node(n);
        last.next = temp;
        last = temp;
        length++;
    }

    public Node deQueue() {
        if(first == null) {
            return null;
        }
        Node temp = first;
        if(first == last) {
            temp.next = null;
            first = null;
            last = null;
        }
        else {
            first = temp.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
