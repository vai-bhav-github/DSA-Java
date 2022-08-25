import java.util.Arrays;

public class RunningSumOf1DArray {
    // https://leetcode.com/problems/running-sum-of-1d-array/
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans[i]= sum;
        } 
        return ans;
    }
}
