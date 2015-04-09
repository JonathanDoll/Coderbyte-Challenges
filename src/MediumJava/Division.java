package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function Division(num1,num2) take both parameters being passed and
 * return the Greatest Common Factor. That is, return the greatest number that
 * evenly goes into both numbers with no remainder. For example: 12 and 16 both
 * are divisible by 1, 2, and 4 so the output should be 4. The range for both
 * parameters will be from 1 to 10^3.
 */
public class Division {

    int Division(double num1, double num2) {
        double en;
        if (num1 < num2) {
            en = num1;
        } else {
            en = num2;
        }
        for (int i = (int) en; i > 0; i--) {
            if ((Math.round(num1 / i) == num1 / i) && (Math.round(num2 / i) == num2 / i)) {
                return i;
            }
        }
        return 0;
    }

}
