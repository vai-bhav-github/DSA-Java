public class firstAndLastPosition {
    public static void main(String[] args) {
        
    }
    static int[] firstAndLastPosition(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0]=search(arr, target, true);
        if(ans[0]!=-1){
            ans[1]=search(arr, target, false);
        }
        return ans;
    }
    static int search(int[] arr, int target,boolean findStartIndex){
        int ans = -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            // find the middle element
            // int mid = (start+end)/2 // might be possible that start+end exceed the max of int in java
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            } else{
                // Potential ans is found
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
