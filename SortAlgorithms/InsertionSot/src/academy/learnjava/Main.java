package academy.learnjava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

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

//        for (int candidateIndex = 1; candidateIndex < arr.length; candidateIndex++) {
//            int insertPlaceIndex = candidateIndex;
//            int temp = arr[candidateIndex];
//            for (int i = candidateIndex - 1; i >= 0; i--) {
//                if (temp < arr[i]) {
//                    arr[insertPlaceIndex--] = arr[i];
//                }
//            }
//            arr[insertPlaceIndex] = temp;
//        }
        System.out.println(Arrays.toString(arr));
    }
}
