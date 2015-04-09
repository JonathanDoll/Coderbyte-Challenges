package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function StringScramble(str1,str2) take both parameters being passed
 * and return the string true if a portion of str1 characters can be rearranged
 * to match str2, otherwise return the string false. For example: if str1 is
 * "rkqodlw" and str2 is "world" the output should return true. Punctuation and
 * symbols will not be entered with the parameters.
 */
public class StringScramble {

    String StringScramble(String str1, String str2) {
        int ltaf = str2.length();
        if (str2.length() > str1.length()) {
            return "false";
        }
        char[] charray1 = str1.toCharArray();
        char[] charray2 = str2.toCharArray();
        for (int i = 0; i < charray2.length; i++) {
            for (int j = 0; j < charray1.length; j++) {
                if (charray1[j] == charray2[i]) {
                    ltaf--;
                    if (ltaf == 0) {
                        return "true";
                    }
                    charray1[j] = '1';
                    j = charray2.length;
                }
            }
        }
        return "false";
    }

}
