package com.vaishnavi.study.dsAndAlgo.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {-4,-1,0,3,10};
        squaresOfSortedArray(nums);

    }

    private static int[] squaresOfSortedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
