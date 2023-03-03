package CodingNinjasSolution.Recursion_2.Merge_Sort_Problem_Statement;

public class solution {

    //print Array
    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //merge sorted array--------------------------------------------------------
    public static void merge(int arr[], int arrL[], int arrR[]) {
        int i = 0, j = 0, k = 0;

        while(i < arrL.length && j < arrR.length) {
            if(arrL[i] < arrR[j]) {
                arr[k++] = arrL[i++];
            }
            else {
                arr[k++] = arrR[j++];
            }
        }
        while(i < arrL.length) {
            arr[k++] = arrL[i++];
        }
        while(j < arrR.length) {
            arr[k++] = arrR[j++];
        }
    }
    //Merge Sort
    public static void mergeSort(int arr[]) {
        if(arr.length == 1) return;

        int mid = arr.length/2;
        int[] arrL = new int[mid];
        int[] arrR = new int[arr.length-mid];

        for(int i = 0; i < mid; i++) {
            arrL[i] = arr[i];
        }
        for(int i = 0; i < arr.length-mid; i++) {
            arrR[i] = arr[mid+i];
        }

        mergeSort(arrL);
        mergeSort(arrR);
        merge(arr, arrL, arrR);
    }
}
