package academy.learnjava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingArray(arr, 1, 10);
        System.out.println(Arrays.toString(arr));

    }

    public static void countingArray(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int value : input) {
            int newPosition = value - min;
            countArray[newPosition]++;
        }

        // this is better than my solution =(
        int j = 0; //j is the index of input array that the count array will convert to
        for (int i = min; i <= max; i++) {
            int countArrayIndex = i - min;
            while (countArray[countArrayIndex] > 0) {
                input[j++] = i;
                countArray[countArrayIndex]--;
            }
        }


        // below is my original solution
//        int tempCount = 0;
//        for (int i = 0; i < countArray.length; i++) {
//            for (int j = 0; j < countArray[i]; j++) {
//                input[tempCount+j] = i+1;
//            }
//            tempCount += countArray[i];//If no element in the current position (means countArray[i] = 0), keep the position until
//            // it has an element
//        }
    }
}
