package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function SimpleSymbols(str) take the str parameter being passed and
 * determine if it is an acceptable sequence by either returning the string true
 * or false. The str parameter will be composed of + and = symbols with several
 * letters between them (ie. ++d+===+c++==a) and for the string to be true each
 * letter must be surrounded by a + symbol. So the string to the left would be
 * false. The string will not be empty and will have at least one letter.
 */
public class SimpleSymbols {

    String SimpleSymbols(String str) {
        String answer = "true";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
                if (i == 0 || i == str.length() - 1) {
                    answer = "false";
                    break;
                }
                if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    answer = "false";
                    break;
                }
            }
        }
        return answer;
    }

}
