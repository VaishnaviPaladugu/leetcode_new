package com.vaishnavi.study.dsAndAlgo.HashTableInterviewQuestions;
import java.util.HashMap;

public class NonRepeatingFirstCharacter {
    public static void main(String args[]) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
    }

    private static Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(char c: charArray) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : charArray) {
            if (map.containsKey(c))
            {
                if(map.get(c) == 1) {
                    return c;
                }
            }
        }
        return null;
    }
}
