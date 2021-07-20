package academy.learnjava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {20, 35, -15, 7, 55, 1, -22, -45,-100,1000 };
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end == start) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid+1, end);
        merge(input, start, mid, end);

    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid] <= input[mid+1]) {
            return;
        }
        int i = start;
        int j = mid + 1;
        int tempIndex = 0;
        int[] tempArray = new int[end-start + 1];

        while (i <= mid && j <= end) {
            tempArray[tempIndex++] = input[i] > input[j] ? input[j++] : input[i++];
        }
         System.arraycopy(input, i, input, start + tempIndex, mid-i+1);
         System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}
