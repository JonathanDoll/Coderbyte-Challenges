package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function DashInsertII(str) insert dashes ('-') between each two odd
 * numbers and insert asterisks ('*') between each two even numbers in str. For
 * example: if str is 4546793 the output should be 454*67-9-3. Don't count zero
 * as an odd or even number.
 */
public class DashInsertII {

    String DashInsertII(String num) {
        String[] arr = num.split("");
        String answer = "";
        answer += arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i].equals("0") && !arr[i - 1].equals("0")) {
                if ((Integer.parseInt(arr[i]) % 2 == 1) && (Integer.parseInt(arr[i - 1]) % 2 == 1)) {
                    answer += "-";
                } else if ((Integer.parseInt(arr[i]) % 2 == 0) && (Integer.parseInt(arr[i - 1]) % 2 == 0)) {
                    answer += "*";
                }
            }
            answer += arr[i];
        }
        return answer;
    }

}
