import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {0,0,0,0,1,1,1,1};
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }
    static int[] plusOne(int[] digits) {
        
        int i=0;
        while(digits[i]==0){
            i++;
        }
        int[] ans = new int[digits.length-i];
        for (int j = 0; j < ans.length; j++) {
            ans[j]=digits[i+j];
        }
        ans[ans.length-1]++;
        return ans;
    }
}
