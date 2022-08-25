import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,58,558,89},
                {41,49,68,92,35,78},
                {48,98,2015,635,874,158},
                {036,965,32,56,89,75}
        };
        int target =41;
    //     searchIn2DArray(arr, target);
    
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static void searchIn2DArray(int[][] arr , int target)
    {
        int i;
       for (i = 0; i < arr.length; i++) {
        
        for (int j = 0; j < arr[i].length; j++) {
            int element = arr[i][j];
            if(element==target){
                System.out.println("Element found: Row Number " + i + " Column number " + j);
                break;
            }
        }
       }
       if(i==arr.length){
        System.out.println("Element not found");
       }
    }

    // KK method's to solve the question 

    static int[] search(int[][] arr , int target)
    {
        int i;
        for (i = 0; i < arr.length; i++) {
         
         for (int j = 0; j < arr[i].length; j++) {
             int element = arr[i][j];
             if(element==target){
                 return new int[]{i,j};
             }
         }
        }
        return new int[]{-1,-1};
    }

    // Find the maximum value in the 2d array

    static int max(int[][] arr)
    {
        int max= Integer.MIN_VALUE;
        int i;
        for (i = 0; i < arr.length; i++) {
         
         for (int j = 0; j < arr[i].length; j++) {
             int element = arr[i][j];
             if(element>max){
                 max = element;
             }
         }
        }
        return max;
    }
}
