package com.learn.springcore;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTests {
    /**
     * Given an integer array nums, return true if any value appears at least twice
     * in the array, and return false if every element is distinct.
     *
     * @param nums the array of integers
     * @return true if the array contains duplicate elements, false otherwise
     */
    boolean containsDuplicates(int[] nums) {
        // Implementation code here
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Example usage:
     * int[] nums = {1, 2, 3, 1};
     * System.out.println(containsDuplicates(nums)); // Output: true
     */
    @Test
    void containsDuplicatesCase1() {
        int[] nums = {1, 2, 3, 1};
        Assertions.assertTrue(containsDuplicates(nums));
    }

    /**
     * Example usage:
     * int[] nums = {1, 2, 3, 4};
     * System.out.println(containsDuplicates(nums)); // Output: false
     */
    @Test
    void containsDuplicatesCase2() {
        int[] nums = {1, 2, 3, 4};
        Assertions.assertFalse(containsDuplicates(nums));
    }

    /**
     * Example usage:
     * int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
     * System.out.println(containsDuplicates(nums)); // Output: true
     */
    @Test
    void containsDuplicatesCase3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(containsDuplicates(nums));
    }
}
