package org.example;

public class Solution {
    public int longestPalindrome(String s) {
        int[] alpha = new int[58];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'A']++;
        }
        int odd = 0;
        int sum = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 == 0) {
                sum += alpha[i];
            } else if (alpha[i] % 2 == 1) {
                odd++;
                sum += alpha[i] - 1;
            }
        }
        return (odd != 0) ? sum + 1 : sum;
    }
}
