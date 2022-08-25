import java.util.Arrays;

public class sumUpZero {
     // https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
    public static void main(String[] args) {
        int n = 7;                                      
        int ans[] = sumZero(n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sumZero(int n) {
        
          int[] ans = new int[n];
        if(n%2==0){
            for (int i = n/2; i < ans.length; i++) {
                ans[i]= i-(n/2)+1;
            }
            for (int i = 0; i < n/2; i++) {
                ans[i]=i-n/2;
            }
        } else{
            ans[n/2]=0;
            for (int i = (n/2)+1; i < ans.length; i++) {
                ans[i]= i-(n/2);
            }
            for (int i = 0; i < n/2; i++) {
                ans[i]=i-n/2;
            }
        }
        return ans;
         
       
        // optimised solution 
        /*
         int[] result = new int[n];
        int i = 0;
        if(n%2!=0) {
            result[0] = 0;
            i++;  
        } 
        int unique = 1;
        while( i < n-1 ) {
                result[i++] = unique;
                result[i++] = -unique;
                unique++;
         }
        return result;
         */
        
    }
}
