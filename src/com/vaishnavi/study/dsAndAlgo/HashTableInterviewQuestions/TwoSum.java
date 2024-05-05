package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }

    private static int[] twoSum(int[] ints, int i) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j = 0 ; j < ints.length ; j++) {
            if(map.containsKey(i - ints[j])) {
                return new int[]{map.get(i - ints[j]), j};
            }
            else {
                map.put(ints[j], j);
            }
        }
        return new int[]{};
    }
}
