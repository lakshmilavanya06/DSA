
// Topic: sorting
// Date Solved: 18-07-2025package sorting;

public class Insertion{
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        // Example:
        // Before sorting: [5, 2, 9, 1, 5, 6]
        //
        // Working steps:
        // i=1: key=2 -> insert at index 0 -> [2, 5, 9, 1, 5, 6]
        // i=2: key=9 -> remains -> [2, 5, 9, 1, 5, 6]
        // i=3: key=1 -> insert at index 0 -> [1, 2, 5, 9, 5, 6]
        // i=4: key=5 -> insert at index 3 -> [1, 2, 5, 5, 9, 6]
        // i=5: key=6 -> insert at index 4 -> [1, 2, 5, 5, 6, 9]
        //
        // After sorting: [1, 2, 5, 5, 6, 9]

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

