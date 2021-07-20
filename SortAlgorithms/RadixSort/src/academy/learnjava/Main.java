package academy.learnjava;

import java.util.Arrays;
import java.util.Currency;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(radixArray,10,4);
        System.out.println(Arrays.toString(radixArray));
    }


    public static void radixSort(int[] input, int radix, int width) {

        for (int unitsPlace = 0; unitsPlace < width; unitsPlace++) {
            singleRadixSort(input, radix, unitsPlace);
        }
    }

    private static void singleRadixSort(int[] input, int radix, int unitsPlace) {
        int[] countArray = new int[radix];

        for (int i : input) {
            int digit = getUnitsPlace(i, unitsPlace, radix);
            countArray[digit]++;
        }

        // sum of each element and all the elements before it, i = sum-1 is the actual index of the elements in
        // temp array in a single stable radix sort
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] temp = new int[input.length];
        // Traverse from left to right guarantees the relative position of elements which have the same number of
        // current units place remains unchanged, so it's stable
        for (int tempIndex = temp.length - 1; tempIndex >= 0; tempIndex--) {
            int digit = getUnitsPlace(input[tempIndex], unitsPlace, radix);

            //-- prefix guarantees the actual position of current element in temp array during this iteration,
            // also keeps track of the remaining position(s) of the same number of current units place
            int index = --countArray[digit];
            temp[index] = input[tempIndex];
        }
        System.arraycopy(temp, 0, input, 0, temp.length);
    }

    private static int getUnitsPlace(int element, int unitsPlace, int radix) {
        return (element / (int) Math.pow(radix, unitsPlace)) % radix;
    }
}
