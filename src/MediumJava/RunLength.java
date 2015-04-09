package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function RunLength(str) take the str parameter being passed and
 * return a compressed version of the string using the Run-length encoding
 * algorithm. This algorithm works by taking the occurrence of each repeating
 * character and outputting that number along with a single character of the
 * repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. The string
 * will not contain any numbers, punctuation, or symbols.
 */
public class RunLength {

    String RunLength(String str) {
        String answer = "";
        str = str.toLowerCase();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                answer += count + "" + str.charAt(i - 1);
                count = 1;
            }
        }
        answer += count + "" + str.charAt(str.length() - 1);
        return answer;
    }

}
