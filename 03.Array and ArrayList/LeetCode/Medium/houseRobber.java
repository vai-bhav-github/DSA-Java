public class houseRobber {
    public static void main(String[] args) {
        int[] nums = {1,5,10,1,16,17,20,5,15};
        System.out.println(rob(nums));
    }
    static int rob(int[] nums) {
        int sumeven =0;
        int sumodd=0;
        for (int i = 0; i < nums.length-4; i=i+2) {
            if(nums[i+2]+nums[i+4]>nums[i+3]){
                sumeven+=nums[i+2];
            }else{
                sumeven+=nums[i+3];
            }
        }
        for (int i = 1; i < nums.length-5; i++) {
            if(nums[i+2]+nums[i+4]>nums[i+3]){
                sumodd+=nums[i+2];
            }else{
                sumodd+=nums[i+3];
            }
        }
        if(sumeven>sumodd){
            return sumeven;
        } else{
            return sumodd;
        }
    }
}
