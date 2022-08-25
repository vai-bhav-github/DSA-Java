public class NumberOfGoodPairs {
    // https://leetcode.com/problems/number-of-good-pairs/
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length-1; i++) {
           for (int j = i+1; j < nums.length; j++) {
            if(nums[i]== nums[j]){
                count++;
            }
           } 
        }
        return count;
    }
}
