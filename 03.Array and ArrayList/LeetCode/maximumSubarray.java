public class maximumSubarray {
    // https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        /*
        int sum =0;
            int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum = sum+nums[j];
                if(sum>max){
                    max=sum;
                }
            }
            sum=0;
        }
        return max; */

        // optimised solution

        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = max(currentSum+nums[i],nums[i]);
            max = max(currentSum,max);
        }
        return max;
    }
    static int max(int a, int b){
        if(a>b){
            return a;
        } else{
            return b;
        }
    }
}
