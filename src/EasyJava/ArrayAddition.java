package EasyJava;

import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr
 * and return the string true if any combination of numbers in the array can be
 * added up to equal the largest number in the array, otherwise return the
 * string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output
 * should return true because 4 + 6 + 10 + 3 = 23. The array will not be empty,
 * will not contain all the same elements, and may contain negative numbers.
 */
public class ArrayAddition {

    String ArrayAdditionI(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int total = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            total += arr[i];
        }
        if (total < largest) {
            return "false";
        }
        return "true";
    }

}
