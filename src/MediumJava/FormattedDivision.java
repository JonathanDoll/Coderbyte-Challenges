package MediumJava;

import java.text.DecimalFormat;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function FormattedDivision(num1,num2) take both parameters being
 * passed, divide num1 by num2, and return the result as a string with properly
 * formatted commas and 4 significant digits after the decimal place. For
 * example: if num1 is 123456789 and num2 is 10000 the output should be
 * "12,345.6789". The output must contain a number in the one's place even if it
 * is a zero.
 */
public class FormattedDivision {

    String FormattedDivision(double num1, double num2) {
        DecimalFormat dm = new DecimalFormat("#,###.0000");
        return dm.format(num1 / num2);
    }

}
