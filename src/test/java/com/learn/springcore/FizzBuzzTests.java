package com.learn.springcore;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    /**
     * Given an integer n, return a string array answer (1-indexed) where:
     * 
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     *
     * @param n an integer
     * @return a string array answer
     */
    List<String> fizzBuzz(int n) {
        // Implementation code here
        List<String> result = new ArrayList<>();

        for (int index = 1; index <= n; index++) {
            boolean isDivisibleBy3 = (index % 3 == 0);
            boolean isDivisibleBy5 = (index % 5 == 0);

            if (isDivisibleBy3 && isDivisibleBy5) {
                result.add("FizzBuzz");
            } else if (isDivisibleBy3) {
                result.add("Fizz");
            } else if (isDivisibleBy5) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(index));
            }
        }
        return result;
    }

    /**
     * Example usage:
     * int n = 3;
     * Output: ["1","2","Fizz"]
     */
    @Test
    void fizzBuzzCase1() {
        int n = 3;
        List<String> actual = fizzBuzz(n);
        List<String> expected = List.of("1", "2", "Fizz");
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Example usage:
     * int n = 5;
     * Output: ["1","2","Fizz","4","Buzz"]
     */
    @Test
    void fizzBuzzCase2() {
        int n = 5;
        List<String> actual = fizzBuzz(n);
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Example usage:
     * int n = 15;
     * Output:
     * ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
     */
    @Test
    void fizzBuzzCase3() {
        int n = 15;
        List<String> actual = fizzBuzz(n);
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                "13", "14", "FizzBuzz");
        Assertions.assertEquals(expected, actual);
    }

}
