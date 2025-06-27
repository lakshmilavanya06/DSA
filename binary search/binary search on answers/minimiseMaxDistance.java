// Problem: minimiseMaxDistance
// Link: https://takeuforward.org/data-structure/allocate-minimum-number-of-pages/
// Topic: Binary search
// Difficulty: Medium
// Approach:  Optimized with BS
// Date Solved: 27-06-2025
//time complexity:O(n logn) and space complexity:O(1)
//time taken:50 mins


public class tUf {
    public static int numberOfGasStationsRequired(double dist, int[] arr,int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt;
    }

    public static double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;
        double low = 0;
        double high = 0;

        //Find the maximum distance:
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, (double)(arr[i + 1] - arr[i]));
        }

        //Apply Binary search:
        double diff = 1e-6 ;
        while (high - low > diff) {
            double mid = low + (high-low) / (2.0);
            int cnt = numberOfGasStationsRequired(mid, arr,n);
            if (cnt > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;
    }
}



