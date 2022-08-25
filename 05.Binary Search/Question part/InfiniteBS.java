public class InfiniteBS {
    public static void main(String[] args) {
        
    }
    static int InfiniteBS1(int[] arr, int target){
        int start =0;
        int end = 100;
        while(true){
            while(start<=end){
                // find the middle element
                // int mid = (start+end)/2 // might be possible that start+end exceed the max of int in java
                int mid = start + (end-start)/2;
                if(arr[mid]>target){
                    end = mid-1;
                } else if(arr[mid]<target){
                    start = mid+1;
                } else{
                    // ans not found
                    return mid;
                }
            }
            start =100;
            end = 200; 
        }
       
        
    }
}
