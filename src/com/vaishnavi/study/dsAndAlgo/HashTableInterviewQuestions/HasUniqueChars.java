package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;

import java.util.HashSet;

public class HasUniqueChars {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false
}

    private static boolean hasUniqueChars(String str) {
        HashSet<Object> set = new HashSet<>();
        for(int i = 0 ; i < str.length() ; i++) {
            if(set.contains(str.charAt(i))) {
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;
    }
    }
