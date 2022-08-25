public class splitArrayLargestSum {
    public static void main(String[] args) {

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);// in  the end of the loop  this will contain the max value from array
            end += nums[i];
        }
        // binary saearch
        while (start < end) {
            // try middle as a potential ans
            int mid = start + (end - start) / 2;
            // calcuate how many pieces you can divide this in with this max sum 
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // we cannot add this(num) in this subarray,make new subarray
                    // you add this(num) in new subarray then you have to do sum=num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start; // here start=end;

    }
}