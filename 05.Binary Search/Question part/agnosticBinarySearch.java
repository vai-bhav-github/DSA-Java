public class agnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-100,-78,-54,-42,-35,-10,0,12,25,56,68,89,92,100};
        int target = 25;
        System.out.println(orderAgnosticBS(arr, target));
    }
    static int orderAgnosticBS(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        boolean check = arr[0]<arr[arr.length -1];
        while(start<=end){
            // find the middle element
            // int mid = (start+end)/2 // might be possible that start+end exceed the max of int in java
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(check){
                if(arr[mid]>target){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else{
                if(arr[mid]>target){
                    start = mid+1;
            } else{
                end=mid-1;
            }
        }
        
    }
        return -1;
}
}  
