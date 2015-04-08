package EasyJava;

/**
 * @author Jonathan Doll
 */

/**
 * Have the function FirstReverse(str) take the str parameter
 * being passed and return the string in reversed order.
 */

public class FirstReverse {

    String FirstReverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
