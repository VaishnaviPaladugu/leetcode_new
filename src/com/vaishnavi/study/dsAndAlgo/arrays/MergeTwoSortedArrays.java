package com.vaishnavi.study.dsAndAlgo.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String args[])
    {
        int[] arr1 = new int[]{1,4,7,20};
        int[] arr2 = new int[]{4,5,6};
        System.out.println(mergeTwoSortedArrays(arr1, arr2));

    }

    private static List<Integer> mergeTwoSortedArrays(int[] arr1, int[] arr2)
    {
        int m = arr1.length;
        int n = arr2.length;

        List<Integer> res = new ArrayList<Integer>();

        int i = 0, j = 0;
        while(i < m && j < n)
        {
            if(arr1[i] == arr2[j])
            {
                res.add(arr1[i]);
                res.add(arr2[j]);
                i++;
                j++;
            }
            else if (arr1[i] > arr2[j])
            {
                res.add(arr2[j]);
                j++;
            }
            else
            {
                res.add(arr1[i]);
                i++;
            }

        }
        while(i < m)
        {
            res.add(arr1[i]);
            i++;
        }
        while(j < n)
        {
            res.add(arr2[j]);
            j++;
        }
        return res;
    }
}
