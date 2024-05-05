package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);
}

    private static List<Integer> removeDuplicates(List<Integer> myList) {

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < myList.size() ; i++) {
            set.add(myList.get(i));
        }
        List<Integer> output = new ArrayList<>(set);
        return output;
    }
    }
