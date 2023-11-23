package com.learn.springcore;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTests {

    /**
     * Penjelasan: barisan ini berawal dari 0 dan 1,
     * kemudian angka berikutnya didapat dengan cara menambahkan kedua bilangan yang
     * berurutan sebelumnya.
     * Dengan aturan ini, maka barisan bilangan Fibonacci yang pertama adalah
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 dan seterusnya.
     */
    List<Integer> determineFibonacci(int count) {
        int current = 0;
        int previous = 1;
        List<Integer> fibonacci = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            // If index is 0 or 1, add it to the list
            if (index == 0 || index == 1) {
                fibonacci.add(index);
            } else {
                int next = current + previous;
                current = previous;
                previous = next;
                fibonacci.add(next);
            }
        }

        return fibonacci;
    }

    @Test
    void testCase1() {
        List<Integer> fibonacci = determineFibonacci(10);
        Assertions.assertArrayEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34).toArray(), fibonacci.toArray());
    }

    @Test
    void testCase2() {
        List<Integer> fibonacci = determineFibonacci(18);
        Assertions.assertArrayEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597).toArray(), fibonacci.toArray());
    }

}
