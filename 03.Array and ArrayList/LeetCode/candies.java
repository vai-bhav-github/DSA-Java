import java.util.Arrays;

public class candies {
    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] ans = kidsWithCandies(arr, extraCandies);
        System.out.println(Arrays.toString(ans));
    }
    static boolean[] kidsWithCandies(int[] arr, int extraCandies) {
        boolean[] ans = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
           
            if(check(arr,arr[i],extraCandies)){
                ans[i]= true;
            } else {
                ans[i] = false;
            }

        }
        return ans;
    }
    static boolean check(int[] arr,int n ,int extraCandies){
        int greatestCandies = n + extraCandies;
        for (int i = 0; i < arr.length; i++) {
            if(greatestCandies<arr[i]){
                return false;
            }
        }
        return true;
    }
}
