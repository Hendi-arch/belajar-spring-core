package com.learn.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningSumArrayTests {
    /**
     * Given an array nums.
     * We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * 
     * Time Complexity:
     * O(n)
     * 
     * @param nums
     * @return the running sum of nums.
     */
    int[] runningSum(int[] nums) {
        // Untuk melacak nomor terakhir sebelum nomor saat ini
        int previousNum = 0;
        // Inisialisasi hasil summarize
        int[] summarizedNum = new int[nums.length];
        // Iterate semua element didalam nums
        for (int index = 0; index < nums.length; index++) {
            // Ambil nomor saat ini
            int number = nums[index];

            // Tambahkan nomor saat ini dengan sebelumnya
            summarizedNum[index] = previousNum += number;
        }
        return summarizedNum;
    }

    /**
     * Example usage:
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    @Test
    void runningSumCase1() {
        int[] nums = {1,2,3,4};
        int[] expected = {1,3,6,10};
        Assertions.assertArrayEquals(expected, runningSum(nums));
    }

    /**
     * Example usage:
     * Input: [1,1,1,1,1]
     * Output: [1,2,3,4,5]
     * Explanation: 
     * Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
     */
    @Test
    void runningSumCase2() {
        int[] nums = {1,1,1,1,1};
        int[] expected = {1,2,3,4,5};
        Assertions.assertArrayEquals(expected, runningSum(nums));
    }

    /**
     * Example usage:
     * Input: [3,1,2,10,1]
     * Output: [3,4,6,16,17]
     */
    @Test
    void runningSumCase3() {
        int[] nums = {3,1,2,10,1};
        int[] expected = {3,4,6,16,17};
        Assertions.assertArrayEquals(expected, runningSum(nums));
    }

}
