package MediumJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function BracketMatcher(str) take the str parameter being passed and
 * return 1 if the brackets are correctly matched and each one is accounted for.
 * Otherwise return 0. For example: if str is "(hello (world))", then the output
 * should be 1, but if str is "((hello (world))" the the output should be 0
 * because the brackets do not correctly match up. Only "(" and ")" will be used
 * as brackets. If str contains no brackets return 1.
 */
public class BracketMatcher {

    int BracketMatcher(String str) {
        Pattern p = Pattern.compile("[^(^)]");
        Matcher m = p.matcher(str);
        String test = m.replaceAll("");
        if (test.replace("(", "").length() == test.length() / 2.0) {
            return 1;
        }
        return 0;
    }

}
