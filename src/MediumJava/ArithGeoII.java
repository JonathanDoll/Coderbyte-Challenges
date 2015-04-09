package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function ArithGeoII(arr) take the array of numbers stored in arr and
 * return the string "Arithmetic" if the sequence follows an arithmetic pattern
 * or return "Geometric" if it follows a geometric pattern. If the sequence
 * doesn't follow either pattern return -1. An arithmetic sequence is one where
 * the difference between each of the numbers is consistent, where as in a
 * geometric sequence, each term after the first is multiplied by some constant
 * or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example: [2,
 * 6, 18, 54]. Negative numbers may be entered as parameters, 0 will not be
 * entered, and no array will contain all the same elements.
 */
public class ArithGeoII {

    String ArithGeoII(int[] num) {
        boolean ari = true;
        boolean geo = true;
        int aridiff = num[1] - num[0];
        int geodiff = num[1] / num[0];
        for (int i = 2; i < num.length; i++) {
            if (num[i] - aridiff != num[i - 1]) {
                ari = false;
            }
            if (num[i] / geodiff != num[i - 1]) {
                geo = false;
            }
            if (!geo && !ari) {
                break;
            }
        }
        if (ari) {
            return "Arithmetic";
        } else if (geo) {
            return "Geometric";
        }
        return "-1";
    }

}
