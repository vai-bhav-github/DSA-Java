import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int nums[] ={-1,100,3,99};
        int k =2;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    static void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for (int i = nums.length-k; i < ans.length; i++) {
            ans[k-nums.length+i]=nums[i];
        }
        for (int i = 0; i < nums.length-k-1; i++) {
            ans[nums.length-k+i]=nums[i];
        }
        for (int i = 0; i < ans.length; i++) {
            nums[i]=ans[i];
        }
    }
}
