package EasyJava;

import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function SecondGreatLow(arr) take the array of numbers stored in arr
 * and return the second lowest and second greatest numbers, respectively,
 * separated by a space. For example: if arr contains [7, 7, 12, 98, 106] the
 * output should be 12 98. The array will not be empty and will contain at least
 * 2 numbers. It can get tricky if there's just two numbers!
 */
public class SecondGreatLow {

    String SecondGreatLow(int[] arr) {
        Arrays.sort(arr);
        int low = arr[0];
        int high = arr[arr.length-1];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != low){
                low = arr[i];
                break;
            }
        }
        for(int i = arr.length-2; i > -1; i--){
            if(arr[i] != high){
                high = arr[i];
                break;
            }
        }
        return low + " " + high;
    }

}
