package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function PrimeMover(num) return the numth prime number. The range
 * will be from 1 to 10^4. For example: if num is 16 the output should be 53 as
 * 53 is the 16th prime number.
 */
public class PrimeMover {

    int PrimeMover(int num) {
        int primeCount = -1;
        for (int i = 1; i <= 10000; i++) {
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                if (++primeCount == num) {
                    return i;
                }
            }
        }
        return 0;
    }

}
