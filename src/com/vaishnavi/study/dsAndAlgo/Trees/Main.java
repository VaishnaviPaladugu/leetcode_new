package com.vaishnavi.study.dsAndAlgo.Trees;

public class Main {
    public static void main(String args[]) {
//        BinarySearchTree myBst = new BinarySearchTree();
//        myBst.insert(2);
//        myBst.insert(4);
//        System.out.println("Root:" + myBst.root.value);
//        System.out.println("Node:" +myBst.root.right.value);
//        System.out.println(myBst.contains(-9));
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);


        System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));
    }
}
