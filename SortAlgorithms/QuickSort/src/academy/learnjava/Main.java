package academy.learnjava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, 400, -200, 400, -10};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end > start) {
            int pivotIndex = partition1(input, start, end);

            quickSort(input, start, pivotIndex-1);
            quickSort(input, pivotIndex+1, end);
        }
    }
    public static int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int j = start; //j is the pointer for larger values than pivot

        //i is the pointer traverse all the elements before the pivot
        //i and j are at the same beginning point at first
        for (int i = start; i < end; i++) {
            if (input[i] <= pivot) {
                swap(input, i, j);//When smaller element is found, swap its position with the current larger value's
                j++; //Move to the next large value
            }
        }
        swap(input,j,end); //Swap current large value's position with the pivot position at the end
        return j; //j is sorted pivot position
    }

    public static void swap(int[]input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    private static int partition1(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;


        while (i < j) {
            while (i < j && input[j] >= pivot){
                j--;
            }
            if (i < j) {
                input[i++] = input[j];
            }
            while (i < j && input[i] <= pivot){
                i++;
            }
            if (i < j) {
                input[j--] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }


}
