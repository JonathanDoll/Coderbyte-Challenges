package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function TimeConvert(num) take the num parameter being passed and
 * return the number of hours and minutes the parameter converts to (ie. if num
 * = 63 then the output should be 1:3). Separate the number of hours and minutes
 * with a colon.
 */
public class TimeConvert {

    String TimeConvert(int num) {
        return num / 60 + ":" + num % 60;
    }

}
