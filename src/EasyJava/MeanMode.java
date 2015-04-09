package EasyJava;

import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function MeanMode(arr) take the array of numbers stored in arr and
 * return 1 if the mode equals the mean, 0 if they don't equal each other (ie.
 * [5, 3, 3, 3, 1] should return 1 because the mode (3) equals the mean (3)).
 * The array will not be empty, will only contain positive integers, and will
 * not contain more than one mode.
 */
public class MeanMode {

    int MeanMode(int[] arr) {
        int mean = 0;
        int mode = 0;
        int highest = 0;
        int count = 0;
        for (int i : arr) {
            mean += i;
        }
        mean /= arr.length;
        Arrays.sort(arr);
        mode = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > highest) {
                    highest = count;
                    mode = arr[i];
                }
            }
        }
        if (mode == mean) {
            return 1;
        }
        return 0;
    }

}
