package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function SwapCase(str) take the str parameter and swap the case of
 * each character. For example: if str is "Hello World" the output should be
 * hELLO wORLD. Let numbers and symbols stay the way they are.
 */
public class SwapCase {

    String SwapCase(String str) {
        char[] charray = str.toCharArray();
        String answer = "";
        for (char a : charray) {
            if (a >= 'a' && a <= 'z') {
                answer += (char) ((int) a - 32);
            } else if (a >= 'A' && a <= 'Z') {
                answer += (char) ((int) a + 32);
            } else {
                answer += a;
            }
        }
        return answer;
    }

}
