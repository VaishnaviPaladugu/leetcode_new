package com.vaishnavi.study.dsAndAlgo.arrays;

public class IsSubsequence {
    public static void main(String args[])
    {
        String s1 = "aze";
        String s2 = "abcde";
        System.out.println(isSubsequence(s1, s2));
    }

    private static boolean isSubsequence(String s1, String s2)
    {
        int i = 0, j = 0;
        while(j < s2.length() && i < s1.length())
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i == s1.length();
    }
}
