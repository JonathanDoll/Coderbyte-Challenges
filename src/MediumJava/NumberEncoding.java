package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function NumberEncoding(str) take the str parameter and encode the
 * message according to the following rule: encode every letter into its
 * corresponding numbered position in the alphabet. Symbols and spaces will also
 * be used in the input. For example: if str is "af5c a#!" then your program
 * should return 1653 1#!.
 */
public class NumberEncoding {

    String NumberEncoding(String str) {
        char[] charray = str.toCharArray();
        String answer = "";
        for (char a : charray) {
            if (a >= 'a' && a <= 'z') {
                answer += (int) a - 96;
            } else if (a >= 'A' && a <= 'Z') {
                answer += (int) a - 64;
            } else {
                answer += a;
            }
        }
        return answer;
    }

}
