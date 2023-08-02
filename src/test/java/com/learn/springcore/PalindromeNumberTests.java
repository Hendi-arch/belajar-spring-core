package com.learn.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTests {
   /**
    * Palindrome
    * An integer is a palindrome when it reads the same forward and backward.
    * For example, {@code 121} is a palindrome while {@code 123} is not.
    *
    * @param x an integer
    * @return {@code true} if x is a palindrome, and {@code false} otherwise.
    */
   boolean isPalindrome(int x) {
      // Implementation code here
      if (x < 0) {
         // Jika x adalah minus, langsung aja balikin false
         return false;
      }

      int num = x;
      int reversed = 0;
      while (num > 0) {
         int lastDigit = num % 10;
         reversed = reversed * 10 + lastDigit;
         num = num / 10;
      }
      return x == reversed;
   }

   /**
    * Example usage:
    * Input: x = 121
    * Output: true
    * Explanation: 121 reads as 121 from left to right and from right to left.
    */
    @Test
    void isPalindromeCase1() {
      int x = 121;
      Assertions.assertTrue(isPalindrome(x));
    }

   /**
    * Example usage:
    * Input: x = -121
    * Output: false
    * Explanation: From left to right, it reads -121. From right to left,
    * it becomes 121-. Therefore it is not a palindrome.
    */
    @Test
    void isPalindromeCase2() {
      int x = -121;
      Assertions.assertFalse(isPalindrome(x));
    }

   /**
    * Example usage:
    * Input: x = 10
    * Output: false
    * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    */
    @Test
    void isPalindromeCase3() {
      int x = 10;
      Assertions.assertFalse(isPalindrome(x));
    }

}
