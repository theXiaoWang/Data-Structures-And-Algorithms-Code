package academy.learnjava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

//        insertionSort(arr);
        recursionInsertionSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    //Using While loop
    private static void insertionSort(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];
            int i = firstUnsortedIndex; //i means the first element index
            //of the sorted part

            while (i > 0 && newElement < arr[i-1]) { // loop through the sorted part until hit the first element
                // inclusive
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = newElement; //i is the insertion place index
        }
    }

    //Using for loop
    private static void insertionSort2(int[] arr) {
        for (int candidateIndex = 1; candidateIndex < arr.length; candidateIndex++) {
            int insertPlaceIndex = candidateIndex;
            int temp = arr[candidateIndex];
            for (int i = candidateIndex - 1; i >= 0; i--) {
                if (temp < arr[i]) {
                    arr[insertPlaceIndex--] = arr[i];
                }
            }
            arr[insertPlaceIndex] = temp;
        }
    }

    //Using recursion
    private static void recursionInsertionSort(int[] arr, int items) {
        if (items < 2) {
            return;
        }
        recursionInsertionSort(arr, items - 1);
        int i = items - 1;
        int newElement = arr[i];

        while (i > 0 && arr[i - 1] > newElement) {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[i] = newElement;
    }
}
