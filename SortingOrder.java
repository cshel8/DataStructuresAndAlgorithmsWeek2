import java.util.Arrays;
public class SortingOrder {
    public static void main(String[] args) {
        int originalArr[] = {6, 3, 8, 9, 2, 1};
        int arr1[] = originalArr.clone();
        int arr2[] = originalArr.clone();
        int arr3[] = originalArr.clone();
        System.out.println("Original Array: " + Arrays.toString(originalArr));
        sSort(arr1);
        System.out.println("Selection Sort: " + Arrays.toString(arr1));
        mergeSort(arr2, 0, arr2.length - 1,1);
        System.out.println("Merge Sort: " + Arrays.toString(arr2));
        bbSort(arr3);
        System.out.println("Bubble Sort: " + Arrays.toString(arr3));
    }
    private static void sSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            if (minIdx != i) {
                int tempTest = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = tempTest;
            }
            System.out.println("Selection Sort Round " + (i + 1));
        }
    }
    public static void mergeSort(int[] arr, int l, int r, int round){
        if(l < r){
            int m = (l + r) / 2;
            System.out.println("Merge Sort Round " + round);
            mergeSort(arr, l, m,  round + 1);
            mergeSort(arr, m + 1, r, round + 1);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while(i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    private static void bbSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            System.out.println("Bubble Sort Round " + (i + 1 ));
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
}