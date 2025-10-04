package Matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j< arr.length ; j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposedMatrix = transpose(matrix);
        for (int i = 0; i < transposedMatrix.length; i++) {
            System.out.println(Arrays.toString(transposedMatrix[i]));
        }
    }
}
