package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function TripleDouble(num1,num2) take both parameters being passed,
 * and return 1 if there is a straight triple of a number at any place in num1
 * and also a straight double of the same number in num2. For example: if num1
 * equals 451999277 and num2 equals 41177722899, then return 1 because in the
 * first parameter you have the straight triple 999 and you have a straight
 * double, 99, of the same number in the second parameter. If this isn't the
 * case, return 0.
 */
public class TripleDouble {

    int TripleDouble(int num1, int num2) {
        String number1 = num1 + "";
        String number2 = num2 + "";
        for (int i = 0; i < number1.length(); i++) {
            char letter = number1.charAt(i);
            if (number1.contains(letter + "" + letter + "" + letter) && number2.contains(letter + "" + letter)) {
                return 1;
            }
        }
        return 0;
    }

}
