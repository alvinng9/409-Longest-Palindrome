package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestPalindromeTest() {
        Solution solution = new Solution();
        assertEquals(7, solution.longestPalindrome("abccccdd"));
        assertEquals(1, solution.longestPalindrome("Aa"));
        assertEquals(11, solution.longestPalindrome("abccccdddddd"));
        assertEquals(25, solution.longestPalindrome("abbcccddddeeeeeffffffggggggg"));
    }

}