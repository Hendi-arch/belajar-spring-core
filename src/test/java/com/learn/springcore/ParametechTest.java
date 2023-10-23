package com.learn.springcore;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ParametechTest {
    /// Tampilkan bilangan genap dari 20 sampai 50
    @Test
    void evenNumberTest() {
        List<Integer> actual = new ArrayList<>();
        for (int index = 20; index <= 50; index++) {
            if (index % 2 == 0) {
                actual.add(index);
            }
        }

        System.out.println("evenNumberTest : Actual: " + actual);
    }

    /// Tampilkan */asterix
    /// row1 = 7*
    /// row2 = 6*
    /// until row7 = 1*
    @Test
    void asterixTest() {
        for (int index = 7; index >= 1; index--) {
            System.out.println("*".repeat(index));
        }
    }

    /// Tampilkan bilangan prima dari 20 sampai dengan 60
    @Test
    void primaNumberTest() {
        List<Integer> actual = new ArrayList<>();
        for (int num = 20; num <= 60; num++) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int div = 2; div <= Math.sqrt(num); div++) {
                    if (num % div == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                actual.add(num);
            }
        }

        System.out.println("primaNumberTest : Actual :" + actual);
    }
}
