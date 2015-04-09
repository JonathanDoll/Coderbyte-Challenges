package HardJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function MatrixDeterminant(strArr) read strArr which will be an
 * array of integers represented as strings. Within the array there will also be
 * "<>" elements which represent break points. The array will make up a matrix
 * where the (number of break points + 1) represents the number of rows. Here is
 * an example of how strArr may look: ["1","2","<>","3","4"]. The contents of
 * this array are row1=[1 2] and row2=[3 4]. Your program should take the given
 * array of elements, create the proper matrix, and then calculate the
 * determinant. For the example above, your program should return -2. If the
 * matrix is not a square matrix, return -1. The maximum size of strArr will be
 * a 6x6 matrix. The determinant will always be an integer.
 */
public class MatrixDeterminant {

    int MatrixDeterminant(String[] strArr) {
        double count = 0;
        int size = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("<>")) {
                count++;
                if (size == 0) {
                    size = i;
                }
            }
        }
        if (Math.sqrt(strArr.length - count) != Math.round(Math.sqrt(strArr.length - count))) {
            return -1;
        }

        int row = 0;
        int column = 0;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("<>")) {
                row++;
                column = 0;
                continue;
            }
            matrix[row][column++] = Integer.parseInt(strArr[i]);
        }

        return matdet(matrix);
    }

    public static int matdet(int[][] num) {
        int total = 0;
        int pn = 1;
        if (num.length == 2) {
            return (num[0][0] * num[1][1]) - (num[0][1] * num[1][0]);
        } else {

            for (int k = 0; k < num.length; k++) {
                int[][] newMatrix = new int[num.length - 1][num.length - 1];
                for (int i = 1; i < num.length; i++) {
                    int column = 0;
                    for (int j = 0; j < num.length; j++) {
                        if (j == k) {
                            continue;
                        }
                        newMatrix[i - 1][column++] = num[i][j];
                    }
                }
                total += pn * num[0][k] * matdet(newMatrix);
                pn *= -1;
            }
        }
        return total;
    }

}
