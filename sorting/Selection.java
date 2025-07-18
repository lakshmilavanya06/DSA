// Topic: sorting
// Date Solved: 18-07-2025
package sorting;

public class Selection {
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // Example:
        // Before sorting: [5, 2, 9, 1, 5, 6]
        //
        // Working steps:
        // i=0: select min=1, swap with arr[0] -> [1, 2, 9, 5, 5, 6]
        // i=1: min=2, already at position -> [1, 2, 9, 5, 5, 6]
        // i=2: min=5, swap with arr[2] -> [1, 2, 5, 9, 5, 6]
        // i=3: min=5, swap with arr[3] -> [1, 2, 5, 5, 9, 6]
        // i=4: min=6, swap with arr[4] -> [1, 2, 5, 5, 6, 9]
        //
        // After sorting: [1, 2, 5, 5, 6, 9]

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}

