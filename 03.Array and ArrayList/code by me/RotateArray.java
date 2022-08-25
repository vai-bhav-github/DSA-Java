import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int k){
        int d=arr.length-k;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i-d]=arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length-d+i]=temp[i];
        }
    }
}
