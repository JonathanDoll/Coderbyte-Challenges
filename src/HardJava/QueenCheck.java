package HardJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function QueenCheck(strArr) read strArr which will be an array
 * consisting of the locations of a Queen and King on a standard 8x8 chess board
 * with no other pieces on the board. The structure of strArr will be the
 * following: ["(x1,y1)","(x2,y2)"] with (x1,y1) representing the position of
 * the queen and (x2,y2) representing the location of the king with x and y
 * ranging from 1 to 8. Your program should determine if the king is in check
 * based on the current positions of the pieces, and if so, return the number of
 * spaces it can move to in order to get out of check. If the king is not in
 * check, return -1. For example: if strArr is ["(4,4)","(6,6)"] then your
 * program should output 6. Remember, because only the queen and king are on the
 * board, if the queen is checking the king by being directly adjacent to it,
 * technically the king can capture the queen.
 */
public class QueenCheck {

    int QueenCheck(String[] strArr) {
        int qX = Integer.parseInt(strArr[0].charAt(1) + "");
        int qY = Integer.parseInt(strArr[0].charAt(3) + "");
        int kX = Integer.parseInt(strArr[1].charAt(1) + "");
        int kY = Integer.parseInt(strArr[1].charAt(3) + "");
        int total = 0;
        if (!(qX == kX || qY == kY || Math.abs(qX - kX) == Math.abs(qY - kY))) {
            return -1;
        } else {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    total += move(qX, qY, kX + i, kY + j);
                }
            }
        }

        return total;
    }

    public static int move(int qX, int qY, int kX, int kY) {
        if (kX < 1 || kY < 1 || kX > 8 || kY > 8) {
            return 0;
        }
        if (!(qX == kX || qY == kY || Math.abs(qX - kX) == Math.abs(qY - kY)) || (qX == kX && qY == kY)) {
            return 1;
        } else {
            return 0;
        }
    }

}
