package HardJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function KnightJumps(str) read str which will be a string consisting
 * of the location of a knight on a standard 8x8 chess board with no other
 * pieces on the board. The structure of str will be the following: "(x y)"
 * which represents the position of the knight with x and y ranging from 1 to 8.
 * Your program should determine the number of spaces the knight can move to
 * from a given location. For example: if str is "(4 5)" then your program
 * should output 8 because the knight can move to 8 different spaces from
 * position x=4 and y=5.
 */
public class KnightJumps {

    int KnightJumps(String str) {
        str = str.replace(")", "");
        str = str.replace("(", "");
        String[] posStr = str.split(" ");
        int[] pos = {Integer.parseInt(posStr[0]), Integer.parseInt(posStr[1])};
        int count = 0;

        if (pos[0] + 1 < 9 && pos[1] + 2 < 9) {
            count++;
        }
        if (pos[0] + 2 < 9 && pos[1] + 1 < 9) {
            count++;
        }
        if (pos[0] - 1 > 0 && pos[1] + 2 < 9) {
            count++;
        }
        if (pos[0] - 2 > 0 && pos[1] + 1 < 9) {
            count++;
        }
        if (pos[0] + 1 < 9 && pos[1] - 2 > 0) {
            count++;
        }
        if (pos[0] + 2 < 9 && pos[1] - 1 > 0) {
            count++;
        }
        if (pos[0] - 1 > 0 && pos[1] - 2 > 0) {
            count++;
        }
        if (pos[0] - 2 > 0 && pos[1] - 1 > 0) {
            count++;
        }

        return count;

    }

}
