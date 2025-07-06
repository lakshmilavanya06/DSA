// Problem:string-to-integer-atoi
// Link: https://leetcode.com/problems/string-to-integer-atoi/
// Topic: strings
// Difficulty: medium
// Date Solved: 04-07-2025
//time complexity:O(n)
//time taken:20 mins


public class atoi {
    public int myAtoi(String s) {
        int i = 0, sign = 1, r = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int d = s.charAt(i) - '0';
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && d > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            r = r * 10 + d;
            i++;
        }
        return r * sign;
    }
}