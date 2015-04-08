package easy;

import java.util.*;
import java.io.*;

/**
 * Have the function FirstReverse(str) take the str parameter
 * being passed and return the string in reversed order.
 */

class Function {

    String FirstReverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.FirstReverse(s.nextLine()));
    }

}