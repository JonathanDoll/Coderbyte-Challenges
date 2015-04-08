package EasyJava;

import java.util.regex.Pattern;

/**
 * @author Jonathan Doll
 */
/**
 * Using the Java language, have the function VowelCount(str) take the str
 * string parameter being passed and return the number of vowels the string
 * contains (ie. "All cows eat grass" would return 5). Do not count y as a vowel
 * for this challenge.
 */
public class VowelCount {

    int VowelCount(String str) { 
        return Pattern.compile("[^aeiouAEIOU]").matcher(str).replaceAll("").length();
    }
    
}
