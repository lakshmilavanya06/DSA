// Problem:roman-to-integer
// Link: https://leetcode.com/problems/roman-to-integer/
// Topic: strings
// Difficulty: medium
// Date Solved: 03-07-2025
//time complexity:O(n)
//time taken:20 mins
package Strings;
package Strings;

public class romanToInt {
    
    public int romanToInt(String s) {
        int x=0,p=0;
        for(int i=s.length()-1;i>=0;i--){
            int curr=value(s.charAt(i));
            if(curr<p){
                x-=curr;
            }else{
                x+=curr;
            }p=curr;
        }
        return x;
    }
    private int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }return -1;
    }
}

