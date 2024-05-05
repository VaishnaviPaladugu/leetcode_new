package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class FindDuplicates {
    public static void main(String args[]) {
        //int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        int[] nums = {1,2,3,4,5,1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }

    private static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Integer key: map.keySet()) {
            Integer value = map.get(key);
            if(value > 1) list.add(key);
        }
        return list;
    }
}
