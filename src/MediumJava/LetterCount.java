package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function LetterCount(str) take the str parameter being passed and
 * return the first word with the greatest number of repeated letters. For
 * example: "Today, is the greatest day ever!" should return greatest because it
 * has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there
 * are no words with repeating letters return -1. Words will be separated by
 * spaces.
 */
public class LetterCount {

    String LetterCount(String str) {
        String string = str.toUpperCase();
        String[] words = string.split(" ");
        String[] word = str.split(" ");
        int[][] count = new int[words.length][26];
        int highest = 1;
        String answer = "-1";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                count[i][(int) (words[i].charAt(j) - 65)]++;
                if (count[i][(int) (words[i].charAt(j) - 65)] > highest) {
                    highest = count[i][(int) (words[i].charAt(j) - 65)];
                    answer = word[i];
                }
            }
        }
        return answer;
    }

}
