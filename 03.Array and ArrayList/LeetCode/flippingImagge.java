import java.util.Arrays;

public class flippingImagge {
    // https://leetcode.com/problems/flipping-an-image/
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int ans[][] = flipAndInvertImage(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans1 = flip(image);
        int[][] ans2 = image1(ans1);
        return ans2;
    }

    static int[][] image1(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0){
                    arr[i][j]=1;
                } else{
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }

    static int[][] flip(int[][] arr){
        int ans[][] = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
           ans[i] = reverse(arr[i]);
        }
        return ans;
    }

    static int[] reverse(int[] arr1){
        int start =0;
        int end = arr1.length-1;
        while(start<end){
            swap(arr1,start,end);
            start++;
            end--;
        }
        return arr1;
    }

    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}