// Topic: sorting
// Date Solved: 18-07-2025

package sorting;

public class Bubble {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        // Example:
        // Before sorting: [5, 2, 9, 1, 5, 6]
        //
        // Working steps:
        // Pass 1: [2, 5, 1, 5, 6, 9]
        // Pass 2: [2, 1, 5, 5, 6, 9]
        // Pass 3: [1, 2, 5, 5, 6, 9]
        // Pass 4: [1, 2, 5, 5, 6, 9] (no swap, stops)
        //
        // After sorting: [1, 2, 5, 5, 6, 9]

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}

