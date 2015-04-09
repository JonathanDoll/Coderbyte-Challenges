package HardJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function NoughtsDeterminer(strArr) take the strArr parameter being
 * passed which will be an array of size eleven. The array will take the shape
 * of a Tic-tac-toe board with spaces strArr[3] and strArr[7] being the
 * separators ("<>") between the rows, and the rest of the spaces will be either
 * "X", "O", or "-" which signifies an empty space. So for example strArr may be
 * ["X","O","-","<>","-","O","-","<>","O","X","-"]. This is a Tic-tac-toe board
 * with each row separated double arrows ("<>"). Your program should output the
 * space in the array by which any player could win by putting down either an
 * "X" or "O". In the array above, the output should be 2 because if an "O" is
 * placed in strArr[2] then one of the players wins. Each board will only have
 * one solution for a win, not multiple wins. You output should never be 3 or 7
 * because those are the separator spaces.
 */
public class NoughtsDeterminer {

    int NoughtsDeterminer(String[] strArr) {
        int[] mults = {2, 6, 8, 10};
        boolean answerFound = false;

        for (int i = 0; i < strArr.length; i += 2) {
            for (int j = 0; j < 4; j++) {
                if (i == 2 && j == 0) {
                    continue;
                }
                if (i == 6 && j == 0) {
                    continue;
                }
                if (((i + mults[j]) / 2 == 5 || ((i + mults[j]) / 2) % 2 == 0) && i + mults[j] < 11) {
                    int[] res = {i, i + mults[j], (i + i + mults[j]) / 2};
                    if (strArr[res[0]].equals(strArr[res[1]]) && !strArr[res[0]].equals("-")) {
                        if (strArr[res[2]].equals("-")) {
                            return res[2];
                        }
                    }
                    if (strArr[res[0]].equals(strArr[res[2]]) && !strArr[res[0]].equals("-")) {
                        if (strArr[res[1]].equals("-")) {
                            return res[1];
                        }
                    }
                    if (strArr[res[1]].equals(strArr[res[2]]) && !strArr[res[1]].equals("-")) {
                        if (strArr[res[0]].equals("-")) {
                            return res[0];
                        }
                    }
                }
            }
        }

        if (!answerFound) {
            if (strArr[1].equals("-")) {
                return 1;
            } else {
                return 9;
            }
        }

        return -1;
    }

}
