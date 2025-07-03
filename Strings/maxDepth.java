// Problem:maximum-nesting-depth-of-the-parentheses
// Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// Topic: strings
// Difficulty: medium
// Date Solved: 03-07-2025
//time complexity:O(n)
//time taken:15 mins
public class maxDepth {
    public int maxDepth(String s) {
        char[] p=s.toCharArray();
        int max=0,k=0;
        for(int i=0;i<p.length;i++){
            if(p[i]=='('){
                k++;
                if(k>max){
                    max=k;
                }
            }else if(p[i]==')'){
                k--;
            }
        }
        return max;
    }
}

