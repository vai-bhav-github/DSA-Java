public class firstOccurances {
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,5,6,6,6,9,9,9};
        int target = 6;
        System.out.println(binarysearch(arr, target));
    }   
    static int binarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            // find the middle element
            // int mid = (start+end)/2 // might be possible that start+end exceed the max of int in java
            int mid = start + (end-start)/2;
            if(arr[mid]>=target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            } 
        }
        return start;
    }
}
