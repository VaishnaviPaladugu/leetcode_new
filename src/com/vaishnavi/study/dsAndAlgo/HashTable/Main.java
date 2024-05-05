package com.vaishnavi.study.dsAndAlgo.HashTable;

public class Main {
    public static void main(String args[]) {
//        HashTable myHashTable = new HashTable();
//        myHashTable.set("chaitu",1);
//        myHashTable.set("chinnu",1);
//        myHashTable.set("radhi",1);
//        myHashTable.set("abhi",1);
//        myHashTable.printTable();
//        myHashTable.set("chinnu",2);
//        myHashTable.printTable();

//        HashTable myHashTable = new HashTable();
//
//        myHashTable.set("nails", 100);
//        myHashTable.set("tile", 50);
//        myHashTable.set("lumber", 80);

//        System.out.println("Lumber:");
//        System.out.println( myHashTable.get("lumber") );
//
//        System.out.println("\nBolts:");
//        System.out.println( myHashTable.get("bolts") );
//        System.out.println(myHashTable.keys());

        HashTable myHashTable = new HashTable();

        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println( myHashTable.keys() );
    }
}
