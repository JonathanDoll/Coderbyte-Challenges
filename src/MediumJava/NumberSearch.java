package MediumJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function NumberSearch(str) take the str parameter, search for all
 * the numbers in the string, add them together, then return that final number
 * divided by the total amount of letters in the string. For example: if str is
 * "Hello6 9World 2, Nic8e D7ay!" the output should be 2. First if you add up
 * all the numbers, 6 + 9 + 2 + 8 + 7 you get 32. Then there are 17 letters in
 * the string. 32 / 17 = 1.882, and the final answer should be rounded to the
 * nearest whole number, so the answer is 2. Only single digit numbers separated
 * by spaces will be used throughout the whole string (So this won't ever be the
 * case: hello44444 world). Each string will also have at least one letter.
 */
public class NumberSearch {

    int NumberSearch(String str) {
        Pattern p = Pattern.compile("[^0-9]");
        Matcher m = p.matcher(str);
        String string = m.replaceAll(" ");
        String[] result = string.split(" ");
        double total = 0;
        for (String s : result) {
            if (!s.equals("")) {
                total += Integer.parseInt(s);
            }
        }

        p = Pattern.compile("[a-zA-Z]");
        m = p.matcher(str);
        double totalLetters = str.length() - m.replaceAll("").length();
        return Integer.parseInt(Math.round(total / totalLetters) + "");
    }

}
