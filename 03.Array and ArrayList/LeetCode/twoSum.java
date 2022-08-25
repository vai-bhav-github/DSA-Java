import java.util.Arrays;

public class twoSum {
    // https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int remain = target-nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(j==i){
                    continue;
                }
                if(nums[j]==remain){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};


        // better solution
        /*
          for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j} ;
                }
            }
        }   
        return new int[2];
         */
       
    }
}
