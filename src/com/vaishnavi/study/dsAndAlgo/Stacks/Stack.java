package com.vaishnavi.study.dsAndAlgo.Stacks;

public class Stack {
    private Node top;
    private int height;

    public class Node {
        int value;
        Node next;
        Node(int val) {
            this.value = val;
        }
    }

    public Stack(int n) {
        Node newNode = new Node(n);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int n) {
        if(top == null) {
            Node newNode = new Node(n);
            top = newNode;
            height = 1;
            return;
        }
            Node temp = new Node(n);
            temp.next = top;
            top = temp;
            height++;

    }

    public Node pop() {
        if(height == 0)
            return null;
        Node removedNode = top;
        top = top.next;
        removedNode.next = null;
        height--;
      //  System.out.println("removed node" + removedNode.value);
        return removedNode;
    }

}
