package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function DashInsert(str) insert dashes ('-') between each two odd
 * numbers in str. For example: if str is 454793 the output should be 4547-9-3.
 * Don't count zero as an odd number.
 */
public class DashInsert {

    String DashInsert(String str) {
        String[] arr = str.split("");
        String answer = "";
        answer += arr[1];
        for (int i = 2; i < arr.length; i++) {
            if ((Integer.parseInt(arr[i]) % 2 == 1) && (Integer.parseInt(arr[i - 1]) % 2 == 1)) {
                answer += "-";
            }
            answer += arr[i];
        }
        return answer;
    }

}
