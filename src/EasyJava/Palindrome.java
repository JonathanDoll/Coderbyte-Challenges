package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function Palindrome(str) take the str parameter being passed and
 * return the string true if the parameter is a palindrome, (the string is the
 * same forward as it is backward) otherwise return the string false. For
 * example: "racecar" is also "racecar" backwards. Punctuation and numbers will
 * not be part of the string.
 */
public class Palindrome {

    String Palindrome(String str) {
        String string = str.replace(" ", "");
        StringBuffer sb = new StringBuffer(string);
        String reverse = sb.reverse() + "";
        if (string.equalsIgnoreCase(reverse)) {
            return "true";
        }
        return "false";
    }

}
