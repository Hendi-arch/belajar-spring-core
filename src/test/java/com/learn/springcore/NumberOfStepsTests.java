package com.learn.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfStepsTests {
    /**
     * Given an integer num, return the number of steps to reduce it to zero.
     * In one step, if the current number is even, you have to divide it by 2,
     * otherwise, you have to subtract 1 from it.
     * 
     * @param num
     * @return the {@code number} of steps to reduce it to zero.
     */
    int numberOfSteps(int num) {
        // Implementation code here
        int n = num;
        for (int index = 0; index < num; index++) {
            // Cek apakah current n adalah genap
            boolean isEven = n % 2 == 0;
            if (isEven) { // Jika True maka n dibagi dengan 2
                n = n / 2;
            } else { // Jika False maka n dikurangi dengan 1
                n -= 1;
            }

            // Cek jika n sama dengan 0 maka stop
            if (n == 0) {
                n = index + 1;
                break;
            }
        }
        return n;
    }

    /**
     * Example usage:
     * Input: num = 14
     * Output: 6
     * Explanation:
     * Step 1) 14 is even; divide by 2 and obtain 7.
     * Step 2) 7 is odd; subtract 1 and obtain 6.
     * Step 3) 6 is even; divide by 2 and obtain 3.
     * Step 4) 3 is odd; subtract 1 and obtain 2.
     * Step 5) 2 is even; divide by 2 and obtain 1.
     * Step 6) 1 is odd; subtract 1 and obtain 0.
     */
    @Test
    void numberOfStepsCase1() {
        int num = 14;
        Assertions.assertEquals(6, numberOfSteps(num));
    }

    /**
     * Example usage:
     * Input: num = 8
     * Output: 4
     * Explanation:
     * Step 1) 8 is even; divide by 2 and obtain 4.
     * Step 2) 4 is even; divide 2 and obtain 2.
     * Step 3) 2 is even; divide by 2 and obtain 1.
     * Step 4) 1 is odd; subtract 1 and obtain 0.
     */
    @Test
    void numberOfStepsCase2() {
        int num = 8;
        Assertions.assertEquals(4, numberOfSteps(num));
    }

    /**
     * Example usage:
     * Input: num = 123
     * Output: 12
     */
    @Test
    void numberOfStepsCase3() {
        int num = 123;
        Assertions.assertEquals(12, numberOfSteps(num));
    }
}
