package com.learn.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountOddsTests {
    /**
     * Given two non-negative integers {@code low} and {@code high}.
     * 
     * Time Complexity:
     * O(n) = Yang berarti waktu yang dibutuhkan algoritma ini untuk memecahkan suatu masalah,
     *        adalah bergantung kepada size atau isi yang diberikan kepada
     *        parameter {@code low} dan {@code high} / Linear Time Complexity
     *
     * @param low the lowest integer value
     * @param high the highest integer value
     * @return the count of odd numbers between {@code low} and {@code high} (inclusive).
     */
    int countOddsLinearTime(int low, int high) {
        // Implementation code here
        int result = 0;
        for (int num = low; num <= high; num++) {
            boolean isNumIsOdd = num % 2 != 0;
            if (isNumIsOdd) {
                result++;
            }
        }
        return result;
    }

    
    /**
     * Given two non-negative integers {@code low} and {@code high}.
     * 
     * Time Complexity:
     * O(1) = Yang berarti waktu yang dibutuhkan algoritma ini untuk memecahkan suatu masalah,
     *        adalah tidak bergantung kepada size atau isi yang diberikan kepada
     *        parameter {@code low} dan {@code high} / Constant Time Complexity
     *
     * @param low the lowest integer value
     * @param high the highest integer value
     * @return the count of odd numbers between {@code low} and {@code high} (inclusive).
     */
    int countOddsConstantTime(int low, int high) {
        // Implementation code here
        int range = high - low; // Get range between low and high (inclusive)
        int count = range / 2; // Asumsi setengah dari range adalah ganjil

        boolean isLowIsOdd = low % 2 != 0;
        boolean isHighIsOdd = high % 2 != 0;
        if (isLowIsOdd || isHighIsOdd) { // Masukan low atau high jika mereka adalah ganjil
            count++;
        }

        return count;
    }

    /**
     * Example usage:
     * Input: low = 3, high = 7
     * Output: 3
     * Explanation: The odd numbers between 3 and 7 are [3,5,7].
     */
    @Test
    void countOddsCase1() {
        int expected = 3;
        Assertions.assertEquals(expected, countOddsConstantTime(3, 7));
    }

    /**
     * Example usage:
     * Input: low = 2, high = 5
     * Output: 2
     * Explanation: The odd numbers between 2 and 5 are [3,5].
     */
    @Test
    void countOddsCase2() {
        int expected = 2;
        Assertions.assertEquals(expected, countOddsConstantTime(2, 5));
    }

    /**
     * Example usage:
     * Input: low = 8, high = 10
     * Output: 1
     * Explanation: The odd numbers between 8 and 10 are [9].
     */
    @Test
    void countOddsCase3() {
        int expected = 1;
        Assertions.assertEquals(expected, countOddsConstantTime(8, 10));
    }

}
