package MediumJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function MultipleBrackets(str) take the str parameter being passed
 * and return 1 #ofBrackets if the brackets are correctly matched and each one
 * is accounted for. Otherwise return 0. For example: if str is "(hello
 * [world])(!)", then the output should be 1 3 because all the brackets are
 * matched and there are 3 pairs of brackets, but if str is "((hello [world])"
 * the the output should be 0 because the brackets do not correctly match up.
 * Only "(", ")", "[", and "]" will be used as brackets. If str contains no
 * brackets return 1.
 */
public class MultipleBrackets {

    String MultipleBrackets(String str) {
        Pattern p = Pattern.compile("[^(^)]");
        Matcher m = p.matcher(str);
        String test = m.replaceAll("");
        int parenCount = 0;
        int braCount = 0;
        if (test.replace("(", "").length() == test.length() / 2.0) {
            parenCount = test.replace("(", "").length();
        }

        p = Pattern.compile("[^\\[^\\]]");
        m = p.matcher(str);
        test = m.replaceAll("");
        if (test.replace("[", "").length() == test.length() / 2.0) {
            braCount = test.replace("[", "").length();
        }

        p = Pattern.compile("[\\[\\]()]");
        m = p.matcher(str);
        test = m.replaceAll("");
        if (test.length() == str.length()) {
            return "1";
        }

        if (braCount != 0 || parenCount != 0) {
            return "1 " + (braCount + parenCount);
        }

        return "0";
    }

}
