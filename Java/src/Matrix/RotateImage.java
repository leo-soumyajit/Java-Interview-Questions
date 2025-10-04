package Matrix;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        //swap transpose
        for(int i = 0 ; i<matrix.length ; i++){
            for (int j = i ; j<matrix.length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0 ; i<matrix.length ; i++){
            int st = 0 , end = matrix.length-1;
            while (st<end){
                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = temp;
                st++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }


}
