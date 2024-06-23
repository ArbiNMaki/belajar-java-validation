package belajarjava.validation.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void whenPalindrome_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        Assertions.assertTrue(palindromeTester.isPalindrome("noon"));
    }

    @Test
    public void whenNearPalindrome_thenReject(){
        Palindrome palindromeTester = new Palindrome();
        Assertions.assertFalse(palindromeTester.isPalindrome("neon"));
    }
}
