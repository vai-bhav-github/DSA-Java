import java.util.Arrays;

public class ConcatenationOfArray {
    // https://leetcode.com/problems/concatenation-of-array/
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums) {
        int index = nums.length + nums.length ;
        int[] ans = new int[index];
        for (int i = 0; i < nums.length; i++) {
            ans[i]= nums[i];
        }
        for(int i=nums.length;i<index;i++){
            ans[i]=nums[i-nums.length];
        }
        return ans;
    }
}
