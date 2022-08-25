import java.util.Arrays;

public class transposeMatrix {
    // https://leetcode.com/problems/transpose-matrix/
    public static void main(String[] args) {
        int[][] arr1 = {
            {2,4,-1},
            {-10,5,11},
            {18,-7,6}
        };
        int[][] arr =transpose(arr1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;

    } 
}
