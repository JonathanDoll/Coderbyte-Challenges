package MediumJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function LookSaySequence(num) take the num parameter being passed
 * and return the next number in the sequence according to the following rule:
 * to generate the next number in a sequence read off the digits of the given
 * number, counting the number of digits in groups of the same digit. For
 * example, the sequence beginning with 1 would be: 1, 11, 21, 1211, ... The 11
 * comes from there being "one 1" before it and the 21 comes from there being
 * "two 1's" before it. So your program should return the next number in the
 * sequence given num.
 */
public class LookSaySequence {

    int LookSaySequence(int num) {
        String answer = "";
        char[] charray = (num + "").toCharArray();
        int count = 1;
        for (int i = 0; i < charray.length - 1; i++) {
            if (charray[i] == charray[i + 1]) {
                count++;
            } else {
                answer += count + "" + charray[i];
                count = 1;
            }
        }
        answer += count + "" + charray[charray.length - 1];
        int ans = Integer.parseInt(answer);
        return ans;
    }

}
