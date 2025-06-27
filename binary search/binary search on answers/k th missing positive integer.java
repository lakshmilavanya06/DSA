// Problem: kth-missing-positive-number
// Link: https://leetcode.com/problems/kth-missing-positive-number/description/
// Topic: Binary search
// Difficulty: Medium
// Approach:  Optimized with BS
// Date Solved: 26-06-2025
//time complexity:O(n logn) and space complexity:O(1)
//time taken:30 mins

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=1,n=arr.length;
        int h=arr[n-1]+k,j=0,x=0,i=1;
        int[] nums=new int[h];
        while(i<=h){
            while(j<n&&i==arr[j]){
                i++;
                j++;
            }
            nums[x]=i;
            i++;
            x++;
        }
        return nums[k-1];
    }
}