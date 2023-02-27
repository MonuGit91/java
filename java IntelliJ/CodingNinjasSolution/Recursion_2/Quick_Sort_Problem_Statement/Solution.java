package CodingNinjasSolution.Recursion_2.Quick_Sort_Problem_Statement;


public class Solution {
    // Swap
    public static void swap(int arr[], int i, int j) {
        if (arr[i] == arr[j])
            return;

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    // break Point
    public static int breakPoint(int arr[], int start, int end) {
        int pivot = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[start]) {
                pivot++;
            }
        }
        swap(arr, start, pivot);

        int i = start, j = end;
        while (i < j) {
            if (arr[i] < arr[pivot]) {
                i++;
            } else {
                if (arr[j] >= arr[pivot]) {
                    j--;
                } else {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }

        }
        return pivot;
    }

    // QuickSorthelper
    public static void QuickSorthelper(int arr[], int start, int end) {
        if (start >= end)
            return;

        // finding pivot index and making all elements before pivot is smaller and after
        // pivot bigger
        int pivot = breakPoint(arr, start, end);// pivot index will be correct index of arr[start]

        QuickSorthelper(arr, start, pivot - 1);
        QuickSorthelper(arr, pivot + 1, end);

    }

    public static void quickSort(int[] arr) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        QuickSorthelper(arr, 0, arr.length - 1);
    }

}