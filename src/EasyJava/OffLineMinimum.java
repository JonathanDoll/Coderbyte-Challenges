package EasyJava;

import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function OffLineMinimum(strArr) take the strArr parameter being
 * passed which will be an array of integers ranging from 1...n and the letter
 * "E" and return the correct subset based on the following rules. The input
 * will be in the following format: ["I","I","E","I",...,"E",...,"I"] where the
 * I's stand for integers and the E means take out the smallest integer
 * currently in the whole set. When finished, your program should return that
 * new set with integers separated by commas. For example: if strArr is
 * ["5","4","6","E","1","7","E","E","3","2"] then your program should return
 * 4,1,5.
 */
public class OffLineMinimum {

    String OffLineMinimum(String[] strArr) {
        int[] numHold = new int[strArr.length];
        Arrays.fill(numHold, 99999);
        String answer = "";
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("E")) {
                numHold[i] = Integer.parseInt(strArr[i]);
            } else {
                Arrays.sort(numHold);
                answer += "," + numHold[0];
                numHold[0] = 99999;
            }
        }
        return answer.substring(1);
    }

}
