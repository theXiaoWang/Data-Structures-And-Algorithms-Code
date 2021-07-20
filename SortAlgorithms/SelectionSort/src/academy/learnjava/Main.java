package academy.learnjava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        Arrays.sort(arr);


        for (int lastUnsortedIndex = arr.length - 1;
             lastUnsortedIndex > 0;
             lastUnsortedIndex--)
        {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[largest] < arr[i]) {
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
