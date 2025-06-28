// Problem: search on 2d matrix
// Link: https://leetcode.com/problems/search-a-2d-matrix/
// Topic: BS
// Difficulty: Medium 
// Date Solved: 28-06-2025
//time:40 mins


package binary search.binary search 2D;

public class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1, ans = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m][0] <= target) {
                if (m == n - 1 || nums[m + 1][0] > target) {
                    ans = m;
                    break;
                } else {
                    l = m + 1;
                }
            } else {
                h = m - 1;
            }
        }
        if (ans == -1) return false;
        l = 0;
        h = nums[ans].length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[ans][m] == target) {
                return true;
            } else if (nums[ans][m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return false;
    }
}
 
