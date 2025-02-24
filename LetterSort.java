import java.util.Arrays;

public class LetterSort {
    public static void main(String[] args) {
        char[] arr = {'C', 'A', 'Z', 'I', 'P', 'H'};
        System.out.println("Before... " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After... " +Arrays.toString(arr));
    }
    public static void mergeSort(char[] arr, int l, int r){
        if(l < r){
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(char[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r -m;
        char[] L = new char[n1];
        char[] R = new char[n2];
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
}