package HardJava;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function BlackjackHighest(strArr) take the strArr parameter being
 * passed which will be an array of numbers and letters representing blackjack
 * cards. Numbers in the array will be written out. So for example strArr may be
 * ["two","three","ace","king"]. The full list of possibilities for strArr is:
 * two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace.
 * Your program should output below, above, or blackjack signifying if you have
 * blackjack (numbers add up to 21) or not and the highest card in your hand in
 * relation to whether or not you have blackjack. If the array contains an ace
 * but your hand will go above 21, you must count the ace as a 1. You must
 * always try and stay below the 21 mark. So using the array mentioned above,
 * the output should be below king. The ace is counted as a 1 in this example
 * because if it wasn't you would be above the 21 mark. Another example would be
 * if strArr was ["four","ten","king"], the output here should be above king. If
 * you have a tie between a ten and a face card in your hand, return the face
 * card as the "highest card". If you have multiple face cards, the order of
 * importance is jack, queen, then king.
 */
public class BlackjackHighest {

    String BlackjackHighest(String[] strArr) {
        ArrayList cards = new ArrayList();
        cards.addAll(Arrays.asList(new String[]{"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"}));
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        int total = 0;

        boolean ace = false;
        String high = strArr[0];

        for (String s : strArr) {
            if (s.equals("ace")) {
                ace = true;
            }
            if (cards.indexOf(s) > cards.indexOf(high) && !s.equals("ace")) {
                high = s;
            }
            total += values[cards.indexOf(s)];
        }

        if (total > 21 && ace) {
            total -= 10;
            ace = false;
        }
        if (ace) {
            high = "ace";
        }

        if (total < 21) {
            return "below " + high;
        } else if (total > 21) {
            return "above " + high;
        } else {
            return "blackjack " + high;
        }
    }

}
