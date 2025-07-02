// Problem:valid-anagram
// Link: https://leetcode.com/problems/valid-anagram/
// Topic: strings
// Difficulty: medium
// Date Solved: 01-07-2025
//time complexity:O(n)
//time taken:15 mins

package Strings;

import java.util.Arrays;

public class anagram {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()) return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}

