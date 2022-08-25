import java.util.Arrays;

public class productEceptSelf {
    //  https://leetcode.com/problems/product-of-array-except-self/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans[] = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int initialMultiply =1;
        for (int i = 0; i < ans.length; i++) {
           initialMultiply*=nums[i];
        }
       
        int multiplyForZero = 1;
        for (int i = 0; i < ans.length; i++) {
            if(nums[i]==0){
                for (int j = 0; j < ans.length; j++) {
                    if(j==i){
                        continue;
                    }else{
                         multiplyForZero*=nums[j];
                    }
                }
                ans[i]=multiplyForZero;
                    multiplyForZero=1;
            }else{
                ans[i] = initialMultiply/nums[i];
            }
            
        }
        return ans;

        // efficient solution
        /*  
         int[] answers = new int[nums.length];
        int total=1;
        int zeros=0;
        for(int idx=0;idx<nums.length; idx++) {
            if(nums[idx]!=0)
                total*=nums[idx];
            else
                zeros++;
        }
        
        for(int idx=0;idx<nums.length; idx++){
            if(zeros == 0) {
                answers[idx]=total/nums[idx];
            } else if(zeros == 1) {
                if(nums[idx] == 0)
                    answers[idx]=total;
                else
                    answers[idx]=0;
            } else {
                answers[idx]=0;
            }
                
        }
        return answers;
         */
    }
}
