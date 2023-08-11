package com.vaishnavi.study.dsAndAlgo.arrays;

public class SortedArray {
    public static void main(String args[])
    {
        int[] arr = new int[]{1, 2, 4, 6, 8, 9, 14, 15};
        int target = 13;
        System.out.println(sortedArray(arr,target));
    }

    private static boolean sortedArray(int[] arr, int target)
    {
        int i = 0;
        int j = arr.length - 1;
        while(i < j)
        {
            if(arr[i] + arr[j] == target)
                return true;
            else if(arr[i] + arr[j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
}
