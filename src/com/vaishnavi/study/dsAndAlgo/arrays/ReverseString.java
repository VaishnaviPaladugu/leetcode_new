package com.vaishnavi.study.dsAndAlgo.arrays;

public class ReverseString {
    public static void main(String args[])
    {
        char[] str = new char[] {'h','e','l','l','o'};
        reverseString(str);
        System.out.println(str);
    }

    private static void reverseString(char[] str) {
        int i = 0, j = str.length - 1;
        while(i < j)
        {
            char ch = str[i];
            str[i] = str[j];
            str[j] = ch;
            i++;
            j--;
        }
    }
}
