public class peakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,6,3,1};
        System.out.println(peakInMountainArray1(arr));
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
}
