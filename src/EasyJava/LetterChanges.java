package EasyJava;

/**
 * @author Jonathan Doll
 */

/**
 * Have the function LetterChanges(str) take the str parameter being passed and
 * modify it using the following algorithm. Replace every letter in the string
 * with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally
 * return this modified string.
 */
public class LetterChanges {

    String LetterChanges(String str) {

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (((int) str.charAt(i) >= (int) 'A' && (int) str.charAt(i) <= (int) 'Z') || ((int) str.charAt(i) >= (int) 'a' && (int) str.charAt(i) <= (int) 'z')) {
                String letter = "" + (char) ((int) str.charAt(i) + 1);
                if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                    letter = letter.toUpperCase();
                    answer += letter;
                } else {
                    answer += letter;
                }
            } else {
                answer += str.charAt(i);
            }
        }
        return answer;

    }
}
