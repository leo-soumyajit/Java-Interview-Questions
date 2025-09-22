package BinarySearch;

public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] arr, int target) {
        int st = 0 , end = arr[0].length-1;
        int i = st , j = end;
        while(i < arr.length && j>=0){
            if(arr[i][j]==target)return true;
            else if(arr[i][j]< target)i++;
            else j--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(matrix,4));
    }
}
