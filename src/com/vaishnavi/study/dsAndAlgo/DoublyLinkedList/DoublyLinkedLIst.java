package com.vaishnavi.study.dsAndAlgo.DoublyLinkedList;

public class DoublyLinkedLIst {
    private Node head;
    private Node tail;
    public int length;

    public class Node {
        int value;
        Node next;
        Node prev;

        Node(int val) {
            this.value = val;
        }

    }

    public DoublyLinkedLIst(int n) {
        Node newNode = new Node(n);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head:" + head.value);
    }

    public void getTail() {
        System.out.println("Tail:" + tail.value);
    }

    public void getLength() {
        System.out.println("Length:" + length);

    }

    public void append(int n) {
        Node newNode = new Node(n);
        if(head == null) {
            head = newNode;
            tail = newNode;
            length = 1;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1) {
            head = null;
            tail = null;
        }
        else {
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int n) {
        if(length == 0) {
            head = new Node(n);
            tail = head;
            length++;
            return;
        }
        Node temp = new Node(n);
        temp.next = head;
        head.prev = temp;
        head = temp;
        length++;
    }

    public Node removeFirst() {
        if(length == 0) {
            return null;
        }
        if(length == 1) {
            head = null;
            tail = null;
        }
        Node temp = head;
        head = temp.next;
        head.prev = null;
        temp.next = null;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        if(index < 0 || index >= length)
        {
            return false;
        }
        Node temp = head;
        if(index < length/2) {
            for(int i = 0 ; i < index ; i++) {
                temp = temp.next;
            }
            temp.value = value;
            return true;
        }
        else {
            temp = tail;
            for(int i = length - 1 ; i > index ; i--) {
                temp = temp.prev;
            }
            temp.value = value;
            return true;
        }
    }

    public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;

            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = previousNode;
            firstNode.prev = secondNode;

            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            head = firstNode.next;
            previousNode = firstNode;
        }

        head = dummyNode.next;
        if (head != null) head.prev = null;
    }
}
