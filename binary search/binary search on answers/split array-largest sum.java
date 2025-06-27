// Problem: split array-largest sum
// Link: https://leetcode.com/problems/split-array-largest-sum/description/
// Topic: Binary search
// Difficulty: Medium
// Approach:  Optimized with BS
// Date Solved: 27-06-2025
//time complexity:O(n logn) and space complexity:O(1)
//time taken:50 mins

class Solution {
    private int fun(int[] nums,int m,int n){
        int p=0,s=0;
        for(int i=0;i<n;i++){
            if(s+nums[i]<=m){
                s+=nums[i];
            }else{
                p++;
                s=nums[i];
            }
        }return p+1;
    }
    public int splitArray(int[] nums, int k) {
    int n=nums.length,l=nums[0],h=0,ans=-1;
    for(int i=0;i<n;i++){
        if(nums[i]>l) l=nums[i];
        h=h+nums[i];
    }
    while(l<=h){
        int m=l+(h-l)/2;
        int f=fun(nums,m,n);
        if(f>k){
            l=m+1;
        }else{
            ans=m;
            h=m-1;
        }
    }
    return ans;
    }
}
