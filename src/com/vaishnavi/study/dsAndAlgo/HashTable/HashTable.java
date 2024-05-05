package com.vaishnavi.study.dsAndAlgo.HashTable;

import java.util.ArrayList;

public class HashTable {
    int size = 7;
    private Node[] dataMap;

    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

    public class Node {
        String key;
        int value;
        Node next;

        Node(String str, int n) {
            this.key = str;
            this.value = n;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public int hash(String s) {
        int hash = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0 ; i < charArray.length ; i++) {
            int ascii = charArray[i];
            hash = (hash + ascii * 23)%dataMap.length;
        }
        return hash;
    }

    public void set(String str, int n) {
        int index = hash(str);
        Node newNode = new Node(str, n);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
            return;
        } else {
            Node temp = dataMap[index];
            if (temp.key == str) {
                temp.value += n;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
                if (temp.key == str) {
                    temp.value += n;
                    return;
                }
            }
            temp.next = newNode;
        }
    }

    public int get(String str) {
        int index = hash(str);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == str) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0 ; i < dataMap.length ; i++) {
            Node temp = dataMap[i];
            while(temp != null) {
                res.add(temp.key);
                temp = temp.next;
            }
        }
        return res;
    }
    }

