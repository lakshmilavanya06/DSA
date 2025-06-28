// Problem: search on 2d matrix part 2
// Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
// Topic: BS
// Difficulty: Medium
// Date Solved: 28-06-2025
//time:30 mins
package binary search.binary search 2D;
public class searchon2Dmatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
         int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }

        return false;
    }
}
