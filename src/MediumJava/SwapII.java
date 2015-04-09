package MediumJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function SwapII(str) take the str parameter and swap the case of
 * each character. Then, if a letter is between two numbers (without
 * separation), switch the places of the two numbers. For example: if str is
 * "6Hello4 -8World, 7 yes3" the output should be 4hELLO6 -8wORLD, 7 YES3.
 */
public class SwapII {

    String SwapII(String str) {
        char[] charray = str.toCharArray();
        String answer = "";

        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(str);
        String nums = m.replaceAll("");
        char[] charray2 = nums.toCharArray();
        for (int i = 1; i < charray2.length; i++) {
            if ((charray2[i] >= '0' && charray2[i] <= '9') && (charray2[i - 1] >= '0' && charray2[i - 1] <= '9')) {
                char hold = charray2[i];
                charray2[i] = charray2[i - 1];
                charray2[i - 1] = hold;
            }
        }
        int count = 0;
        for (char a : charray) {
            if (a >= 'a' && a <= 'z') {
                answer += (char) ((int) a - 32);
            } else if (a >= 'A' && a <= 'Z') {
                answer += (char) ((int) a + 32);
            } else {
                answer += charray2[count++];
            }
        }
        return answer;
    }

}
