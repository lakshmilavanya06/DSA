// Problem: rotateString
// Link: https://leetcode.com/problems/rotateString/
// Topic: strings
// Difficulty: medium
// Date Solved: 01-07-2025
//time complexity:O(n)
//time taken:15 mins

public class rotation {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        
        for(int i=0; i<s.length(); i++) {
            String r = s.substring(i) + s.substring(0, i);
            if(r.equals(goal)) return true;
        }
        
        return false;
    }
}

