import java.util.Arrays;

public class inputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(end-start>=1){
            if(numbers[start]+numbers[end]>target){
                end--;
            } else if(numbers[start]+numbers[end]<target){
                start++;
            } else {
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1,-1};
    }
}
