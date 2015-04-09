package MediumJava;

import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function SimpleMode(arr) take the array of numbers stored in arr and
 * return the number that appears most frequently (the mode). For example: if
 * arr contains [10, 4, 5, 2, 4] the output should be 4. If there is more than
 * one mode return the one that appeared in the array first (ie. [5, 10, 10, 6,
 * 5] should return 5 because it appeared first). If there is no mode return -1.
 * The array will not be empty.
 */
public class SimpleMode {

    int SimpleMode(int[] arr) {
        int mode = 0;
        int highest = 0;
        int count = 0;
        Arrays.sort(arr);
        mode = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > highest) {
                    highest = count;
                    mode = arr[i];
                }
            } else {
                count = 0;
            }
        }
        return mode;
    }

}
