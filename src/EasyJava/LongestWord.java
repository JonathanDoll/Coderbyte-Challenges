package EasyJava;

import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function LongestWord(sen) take the sen parameter being passed and
 * return the largest word in the string. If there are two or more words that
 * are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 */
public class LongestWord {

    String LongestWord(String sen) {
        String newSen = Pattern.compile("[^a-z^A-Z^ ]").matcher(sen).replaceAll("");
        String[] words = newSen.split(" ");
        String longest = words[0];
        for (String s: words) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;

    }
}
