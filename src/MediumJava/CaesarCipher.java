package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function CaesarCipher(str,num) take the str parameter and perform a
 * Caesar Cipher shift on it using the num parameter as the shifting number. A
 * Caesar Cipher works by shifting each letter in the string N places down in
 * the alphabet (in this case N will be num). Punctuation, spaces, and
 * capitalization should remain intact. For example if the string is "Caesar
 * Cipher" and num is 2 the output should be "Ecguct Ekrjgt".
 */
public class CaesarCipher {

    String CaesarCipher(String str, int num) {
        char[] charray = str.toCharArray();
        String answer = "";
        for (char a : charray) {
            if (a >= 'a' && a <= 'z') {
                answer += (char) (((((int) a - 96) + num) % 26) + 96);
            } else if (a >= 'A' && a <= 'Z') {
                answer += (char) (((((int) a - 64) + num) % 26) + 64);
            } else {
                answer += a;
            }
        }
        return answer;
    }

}
