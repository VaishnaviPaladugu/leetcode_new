package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }

    private static List groupAnagrams(String[] strings) {
        List<List<String>> groups = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strings) {
            char[] unsorted = str.toCharArray();
            Arrays.sort(unsorted);
            String sorted = new String(unsorted);
            if(map.containsKey(sorted)) {
                map.get(sorted).add(str);
            }
            else {
                ArrayList<String> mapList = new ArrayList<>();
                mapList.add(str);
                map.put(sorted, mapList);
            }
        }
        for(List lst : map.values()) {
            groups.add(lst);
        }
        return groups;
    }
}
