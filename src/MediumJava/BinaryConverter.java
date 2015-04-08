package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function BinaryConverter(str) return the decimal form of the binary
 * value. For example: if 101 is passed return 5, or if 1000 is passed return 8.
 */
public class BinaryConverter {

    String BinaryConverter(String str) {
        int total = 0;
        int power = 0;
        for (int i = str.length() - 1; i > -1; i--) {
            if (str.charAt(i) == '1') {
                total += Math.pow(2, power);
            }
            power++;
        }
        return "" + (int) total;
    }

}
