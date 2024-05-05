package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindPairs {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
}

    private static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        HashSet<Integer> set = new HashSet<>();
        List<int[]> output = new ArrayList<>();
        for (int i : arr1) {
            set.add(i);
        }
        for(int j : arr2) {
            if(set.contains(target-j)) {
                output.add(new int[]{j, target-j});
            }
        }
        return output;
    }
    }
