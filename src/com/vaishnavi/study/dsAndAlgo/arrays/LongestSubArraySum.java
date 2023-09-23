package com.vaishnavi.study.dsAndAlgo.arrays;

public class LongestSubArraySum {
    public static void main(String args[])
    {
        int[] arr = new int[]{3,1,2,7,4,2,1,1,5};
        int k = 8;
        System.out.println(longestSubArraySum(arr, k));
    }

    private static int longestSubArraySum(int[] arr, int k) {
        int left = 0, sum = 0, ans = 0;
        for(int right = 0 ; right < arr.length ; right++)
        {
            sum += arr[right];
            while(sum > k)
            {
                left++;
                sum -= arr[left];
            }
            ans = Math.max(ans, (right - left+1));
        }
        return ans;
    }


}
