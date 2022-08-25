import java.util.Arrays;

/**
 * searchIn2DArray
 */
public class searchIn2DArray {

    public static void main(String[] args) {
        int[][] arr ={
                {10,20,30,40,50,60,70},
                {12,24,35,46,57,68,79},
                {19,28,36,49,59,69,100}
        };
        int target = 57;
        System.out.println(Arrays.toString(binarysearchin2D(arr, target)));
    }

    static int[] binarysearchin2D(int[][] arr, int target){
        int row=0;
        int col = arr[0].length-1;
        while(row < arr.length && col>=0 ){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]>target){
                col--;
            } else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}