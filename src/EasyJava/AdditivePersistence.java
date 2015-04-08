package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function AdditivePersistence(num) take the num parameter being
 * passed which will always be a positive integer and return its additive
 * persistence which is the number of times you must add the digits in num until
 * you reach a single digit. For example: if num is 2718 then your program
 * should return 2 because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
 */
public class AdditivePersistence {

    int AdditivePersistence(int num) {
        String str = num + "";
        int count = 0;
        while (str.length() > 1) {
            num = 0;
            for (int i = 0; i < str.length(); i++) {
                num += Integer.parseInt(str.charAt(i) + "");
            }
            str = num + "";
            count++;
        }
        return count;
    }

}
