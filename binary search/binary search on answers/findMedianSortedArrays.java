// Problem: find Median Sorted Arrays
// Link:https://takeuforward.org/data-structure/aggressive-cows-detailed-solution/
// Topic: Binary search
// Difficulty: Medium
// Approach:  Optimized with BS
// Date Solved: 26-06-2025
//time complexity:O(n logn) and space complexity:O(1)
//time taken:50 mins
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if(a.length > b.length) return findMedianSortedArrays(b, a);
        
        int m = a.length, n = b.length;
        int l = 0, r = m;
        
        while(l <= r) {
            int pa = (l + r) / 2;
            int pb = (m + n + 1) / 2 - pa;
            
            int maxL1 = (pa == 0) ? Integer.MIN_VALUE : a[pa-1];
            int minR1 = (pa == m) ? Integer.MAX_VALUE : a[pa];
            int maxL2 = (pb == 0) ? Integer.MIN_VALUE : b[pb-1];
            int minR2 = (pb == n) ? Integer.MAX_VALUE : b[pb];
            
            if(maxL1 <= minR2 && maxL2 <= minR1) {
                if((m + n) % 2 == 0)
                    return (Math.max(maxL1, maxL2) + Math.min(minR1, minR2)) / 2.0;
                else
                    return Math.max(maxL1, maxL2);
            } else if(maxL1 > minR2) {
                r = pa - 1;
            } else {
                l = pa + 1;
            }
        }
        return 0.0;
    }
}
