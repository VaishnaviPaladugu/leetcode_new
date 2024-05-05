package com.vaishnavi.study.dsAndAlgo.Trees;

public class BinarySearchTree {
    public Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int val) {
            this.value = val;
        }
    }

    public boolean insert(int n) {
        if(root == null)
        {
            root = new Node(n);
            return true;
        }
        Node temp = root;
        Node newNode = new Node(n);
        while(true) {
            if(temp.value == n) return false;
            if(n < temp.value) {
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            if(n > temp.value) {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int n) {
        if(root == null || n < 0) return false;
        Node temp = root;
        while(temp != null) {
            if(temp.value == n) {
                return true;
            }
            if(n < temp.value) {
                temp = temp.left;
                if(n == temp.left.value) {
                    return true;
                }
            }
            if(n > temp.value) {
                temp = temp.right;
                if(n == temp.right.value) {
                    return true;
                }
            }
        }
        return false;
    }
}
