package HardJava;

import java.util.ArrayList;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function PatternChaser(str) take str which will be a string and
 * return the longest pattern within the string. A pattern for this challenge
 * will be defined as: if at least 2 or more adjacent characters within the
 * string repeat at least twice. So for example "aabecaa" contains the pattern
 * aa, on the other hand "abbbaac" doesn't contain any pattern. Your program
 * should return yes/no pattern/null. So if str were "aabejiabkfabed" the output
 * should be yes abe. If str were "123224" the output should return no null. The
 * string may either contain all characters (a through z only), integers, or
 * both. But the parameter will always be a string type. The maximum length for
 * the string being passed in will be 20 characters. If a string for example is
 * "aa2bbbaacbbb" the pattern is "bbb" and not "aa". You must always return the
 * longest pattern possible.
 */
public class PatternChaser {

    String PatternChaser(String str) {
        for (int j = str.length() / 2; j > 1; j--) {
            ArrayList list = new ArrayList();
            for (int i = 0; i < str.length() - j + 1; i++) {
                list.add(str.substring(i, j + i));
                if (list.size() > 1) {
                    for (int k = 0; k < list.size() - 1; k++) {
                        if (str.substring(i, j + i).equals(list.get(k)) && !list.get(k).equals(list.get(k + 1))) {
                            return "yes " + str.substring(i, j + i);
                        }
                    }
                }
            }
        }
        return "no null";
    }

}
