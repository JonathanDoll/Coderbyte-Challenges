package EasyJava;

import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function AlphabetSoup(str) take the str string parameter being
 * passed and return the string with the letters in alphabetical order (ie.
 * hello becomes ehllo). Assume numbers and punctuation symbols will not be
 * included in the string.
 */
public class AlphabetSoup {

    String AlphabetSoup(String str) {
        char[] charray = str.toCharArray();
        Arrays.sort(charray);
        return new String(charray);
    }
    
}
