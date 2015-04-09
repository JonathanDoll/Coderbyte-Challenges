package MediumJava;

import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function DistinctList(arr) take the array of numbers stored in arr
 * and determine the total number of duplicate entries. For example if the input
 * is [1, 2, 2, 2, 3] then your program should output 2 because there are two
 * duplicates of one of the elements.
 */
public class DistinctList {

    int DistinctList(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

}
