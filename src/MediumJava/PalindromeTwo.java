package MediumJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function PalindromeTwo(str) take the str parameter being passed and
 * return the string true if the parameter is a palindrome, (the string is the
 * same forward as it is backward) otherwise return the string false. The
 * parameter entered may have punctuation and symbols but they should not affect
 * whether the string is in fact a palindrome. For example: "Anne, I vote more
 * cars race Rome-to-Vienna" should return true.
 */
public class PalindromeTwo {

    String PalindromeTwo(String str) {
        Pattern p = Pattern.compile("[\\W]");
        Matcher m = p.matcher(str);
        String string = m.replaceAll("");
        StringBuffer sb = new StringBuffer(string);
        String reverse = sb.reverse() + "";
        if (string.equalsIgnoreCase(reverse)) {
            return "true";
        }
        return "false";
    }

}
