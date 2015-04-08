package EasyJava;

import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function ABCheck(str) take the str parameter being passed and return
 * the string true if the characters a and b are separated by exactly 3 places
 * anywhere in the string at least once (ie. "lane borrowed" would result in
 * true because there is exactly three characters between a and b). Otherwise
 * return the string false.
 */
public class ABCheck {

    String ABCheck(String str) {
        str = Pattern.compile("([aA].{3}[bB])|([bB].{3}[aA])").matcher(str).replaceAll("a   b");
        if(str.contains("a   b")){
            return "true";
        }
        return "false";
    }

}
