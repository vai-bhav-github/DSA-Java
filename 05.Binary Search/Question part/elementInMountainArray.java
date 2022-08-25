public class elementInMountainArray {
    public static void main(String[] args) {
        
    }
    static int search(int[] arr, int target){
        int peak = peakInMountainArray1(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakInMountainArray1(int[] arr){
        int start =0;
        int end=arr.length-1;
       
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
                
            }
            if(arr[mid]<arr[mid+1]){
                
                start=mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr , int target,int start,int end){
       
        boolean check = arr[start]<arr[end];
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
