package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;
import java.util.HashMap;

public class ItemInCommon {
    public static void main(String args[]) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        System.out.println(itemInCommon(array1, array2));
    }

    private static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < array1.length ; i++) {
            if(map.get(array1[i]) == null) {
                map.put(array1[i], 0);
            }
            else {
                int count = map.get(array1[i]);
                map.put(array1[i], count+1);
            }
        }
        for(int i = 0 ; i < array2.length ; i++) {
            if(map.containsKey(array2[i])) {
                return true;
            }
        }
        return false;
    }
}
