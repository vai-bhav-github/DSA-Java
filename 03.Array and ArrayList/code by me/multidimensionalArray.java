import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr1 = {
                {1,2,3,10,11,12},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(arr1[0][4]);
        System.out.println(Arrays.toString(arr1[0]));

        // input    
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
            
        }

        //output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        System.out.println("Enhancd for loop");
        
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
        
        input.close();

    }
}
