package com.vaishnavi.study.dsAndAlgo.arrays;

public class Palindrome {
    public static boolean palindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while(i < j)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}

