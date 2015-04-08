package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function MultiplicativePersistence(num) take the num parameter being
 * passed which will always be a positive integer and return its multiplicative
 * persistence which is the number of times you must multiply the digits in num
 * until you reach a single digit. For example: if num is 39 then your program
 * should return 3 because 3 * 9 = 27 then 2 * 7 = 14 and finally 1 * 4 = 4 and
 * you stop at 4.
 */
public class MultiplicativePersistence {

    int MultiplicativePersistence(int num) {
        String str = num + "";
        int count = 0;
        while (str.length() > 1) {
            num = 1;
            for (int i = 0; i < str.length(); i++) {
                num *= Integer.parseInt(str.charAt(i) + "");
            }
            str = num + "";
            count++;
        }
        return count;
    }

}
