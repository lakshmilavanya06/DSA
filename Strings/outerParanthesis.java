// Problem: removeOuterParentheses
// Link: https://leetcode.com/problems/remove-outermost-parentheses/
// Topic: strings
// Difficulty: easy
// Date Solved: 29-06-2025
//time complexity:O(n)
//time taken:5 mins

public class outerParanthesis {
     public String removeOuterParentheses(String s) {
        int k=0;
        StringBuilder sb= new StringBuilder();
       for(char c:s.toCharArray()){
        if(c=='('){
            if(k>0){
                sb.append(c);
            }
            k++;
        }else{
            k--;
            if(k>0){
                sb.append(c);
            }
        }
       }
        return sb.toString();
    }
}
