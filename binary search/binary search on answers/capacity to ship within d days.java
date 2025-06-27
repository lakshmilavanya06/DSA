// Problem: capacity-to-ship-packages-within-d-days
// Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
// Topic: Binary search
// Difficulty: Medium
// Approach:  Optimized with BS
// Date Solved: 26-06-2025
//time complexity:O(n logn) and space complexity:O(1)
//time taken:50 mins

class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int l = 0, h = 0, ans = -1;
        for (int x : nums) {
            h += x;
            l = Math.max(l, x);
        }

        while (l <= h) {
            int m = l + (h - l) / 2;
            int f = fun(nums, m);
            if (f > days) {
                l = m + 1;
            } else {
                ans = m;
                h = m - 1;
            }
        }
        return ans;
    }

    private int fun(int[] nums, int cap) {
        int days = 1, sum = 0;
        for (int x : nums) {
            if (sum + x > cap) {
                days++;
                sum = 0;
            }
            sum += x;
        }
        return days;
    }
}
