import java.util.Scanner;

/**
 * LinearSearch1
 */
public class LinearSearch1 {

    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        //  Question : Search that 14 is present in array or not?
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==14)
           { System.out.println("Yes, it is present at index " + i );
            break;
        }
        
        }
        if(i==arr.length){
            System.out.println("No, it is not present in array");
        }
    }
}