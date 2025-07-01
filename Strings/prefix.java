// Problem: longest-common-prefix
// Link: https://leetcode.com/problems/longest-common-prefix/
// Topic: strings
// Difficulty: easy
// Date Solved: 01-07-2025
//time complexity:O(n*m)
//time taken:10 mins


package Strings;

public class prefix {
        int n=strs.length,i=0;
        String s=strs[0];
        for(i=1;i<n;i++){
            int k=s.length();
            while(!strs[i].startsWith(s)){
                if(k<0){
                    return "";
                }
                s=s.substring(0,k-1);
                k--;
            }
           
        }
    return s;

    }
}

