import java.util.Arrays;

public class ShuffleTheArray {
    // https://leetcode.com/problems/shuffle-the-array/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int[] ans = shuffle(arr, 4);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n) {
        int newindex = (nums.length)/2;
        int[] ans = new int[newindex];
        int[] ans1 = new int[newindex];
        for (int i = 0; i <newindex; i++) {
            ans[i]= nums[i];
        }
        for (int i = newindex; i < nums.length; i++) {
            ans1[i-newindex]=nums[i];
        }
        int[] ans3 = new int[nums.length];
        ans3[0]=ans[0];
        for (int i = 1; i < ans3.length; i++) {
            if(i%2==0){
                ans3[i]=ans[i/2];
            } else{
                ans3[i]=ans1[(i-1)/2];
            }
        }
        return ans3;
    }
}
