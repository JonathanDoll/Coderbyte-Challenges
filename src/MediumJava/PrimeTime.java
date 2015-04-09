package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function PrimeTime(num) take the num parameter being passed and
 * return the string true if the parameter is a prime number, otherwise return
 * the string false. The range will be between 1 and 2^16.
 */
public class PrimeTime {

    String PrimeTime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "false";
            }
        }
        return "true";
    }

}
