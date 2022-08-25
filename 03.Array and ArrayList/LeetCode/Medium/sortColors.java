import java.util.Arrays;

public class sortColors {
    //  https://leetcode.com/problems/sort-colors/

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    static  void sortColors(int[] nums) {
        int[] ans = new int[nums.length];
        int count0 =0;
        int count1 =0;
        int count2=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                count0++;
            } else if(nums[j]==1){
                count1++;
            }else{
                count2++;
            }
        }
        
        for(int i=0;i<count0;i++){
            ans[i]=0;
        }
        for(int i=count0;i<count1+count0;i++){
            ans[i]=1;
        }
        for(int i=count1+count0;i<count2+count1+count0;i++){
            ans[i]=2;
        }
        for(int j=0;j<ans.length;j++){
            nums[j]=ans[j];
        }
    }
}