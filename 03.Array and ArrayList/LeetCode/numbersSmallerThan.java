import java.util.Arrays;

public class numbersSmallerThan {
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=checkGreater(nums , nums[i]);
        }
        return ans;
    }
    static int checkGreater(int[] arr,int n){
        int count=0;
       for (int i = 0; i < arr.length; i++) {
        if(n>arr[i]){
            count++;
        }
       }
        return count;
    }
}
