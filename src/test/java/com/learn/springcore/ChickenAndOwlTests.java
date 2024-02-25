package com.learn.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChickenAndOwlTests {

    int[] countChickenAndOwl(String param1, String param2) {
        int count = 0;
        int chickenCount = 0;
        int owlCount = 0;

        for (Character num : param1.toCharArray()) {
            // Inner loop to match with the outer loop
            int innerCount = 0;
            for (Character num2 : param2.toCharArray()) {
                if (num.equals(num2) && count == innerCount) {
                    chickenCount++;
                } else if (num.equals(num2)) {
                    owlCount++;
                }
                innerCount++;
            }
            count++;
        }

        return new int[] { chickenCount, owlCount };
    }

    @Test
    void chickenAndOwlTestCase1() {
        String param1 = "1807";
        String param2 = "7812";
        int[] counts = countChickenAndOwl(param1, param2);

        // Test chicken count
        Assertions.assertEquals(1, counts[0]);

        // Test owl count
        Assertions.assertEquals(2, counts[1]);
    }

    @Test
    void chickenAndOwlTestCase2() {
        String param1 = "1807";
        String param2 = "1835";
        int[] counts = countChickenAndOwl(param1, param2);

        // Test chicken count
        Assertions.assertEquals(2, counts[0]);

        // Test owl count
        Assertions.assertEquals(0, counts[1]);
    }

    @Test
    void chickenAndOwlTestCase3() {
        String param1 = "1807";
        String param2 = "7049";
        int[] counts = countChickenAndOwl(param1, param2);

        // Test chicken count
        Assertions.assertEquals(0, counts[0]);

        // Test owl count
        Assertions.assertEquals(2, counts[1]);
    }
}
