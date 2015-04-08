package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num. For
 * the test cases, the parameter num will be any number from 1 to 1000. *
 */
public class SimpleAdding {

    int SimpleAdding(int num) {

        int answer = 0;
        while (num > 0) {
            answer += num--;
        }
        return answer;

    }

}
