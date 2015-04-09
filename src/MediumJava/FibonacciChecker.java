package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function FibonacciChecker(num) return the string yes if the number
 * given is part of the Fibonacci sequence. This sequence is defined by: Fn =
 * Fn-1 + Fn-2, which means to find Fn you add the previous two numbers up. The
 * first two numbers are 0 and 1, then comes 1, 2, 3, 5 etc. If num is not in
 * the Fibonacci sequence, return the string no.
 */
public class FibonacciChecker {

    String FibonacciChecker(int num) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        int count = 1;
        if (num == 0 || num == 1) {
            return "yes";
        }
        while (num3 < num && num2 < num & num1 < num) {
            if (count % 3 == 0) {
                num3 = num1 + num2;
                if (num3 == num) {
                    return "yes";
                }
                count -= 3;
            } else if (count % 2 == 0) {
                num2 = num3 + num1;
                if (num2 == num) {
                    return "yes";
                }
            } else {
                num1 = num2 + num3;
                if (num1 == num) {
                    return "yes";
                }
            }
            count++;
        }
        return "no";
    }

}
