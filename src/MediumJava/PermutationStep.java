package MediumJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function PermutationStep(num) take the num parameter being passed
 * and return the next number greater than num using the same digits. For
 * example: if num is 123 return 132, if it's 12453 return 12534. If a number
 * has no greater permutations, return -1 (ie. 999).
 */
public class PermutationStep {

    int PermutationStep(int num) {
        char[] charray = (num + "").toCharArray();
        boolean sog = true;
        if (charray.length == 1) {
            return -1;
        }
        for (int i = 1; i < charray.length; i++) {
            if (charray[i] > charray[i - 1]) {
                sog = false;
            }
        }
        if (sog) {
            return -1;
        }

        int answer = num;
        while (true) {
            answer++;
            char[] charray2 = (answer + "").toCharArray();
            String nts = num + "";
            for (char a : charray2) {
                Pattern p = Pattern.compile("[" + a + "]");
                Matcher m = p.matcher(nts + "");
                nts = m.replaceFirst("");
            }
            if (nts.length() == 0) {
                return answer;
            }
        }
    }

}
