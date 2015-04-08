package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function WordCount(str) take the str string parameter being passed
 * and return the number of words the string contains (ie. "Never eat shredded
 * wheat" would return 4). Words will be separated by single spaces.
 */
public class WordCount {

    int WordCount(String str) {
        return str.length() - str.replace(" ", "").length() + 1;
    }

}
