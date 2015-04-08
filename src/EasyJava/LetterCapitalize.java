package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function LetterCapitalize(str) take the str parameter being passed
 * and capitalize the first letter of each word. Words will be separated by only
 * one space.
 */
public class LetterCapitalize {

    String LetterCapitalize(String str) {
        String[] words = str.split(" ");
        String answer = "";
        
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (j == 0) {
                    answer += (word.charAt(j) + "").toUpperCase();
                } else {
                    answer += word.charAt(j);
                }
            }
            answer += " ";
        }

        return answer.trim();
    }

}
