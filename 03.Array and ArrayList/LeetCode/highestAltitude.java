public class highestAltitude {
    // https://leetcode.com/problems/find-the-highest-altitude/
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];
        int sum=0;
        ans[0]=0;
        for (int i = 0; i < gain.length; i++) {
            sum+=gain[i];
            ans[i+1]=sum;
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
}
