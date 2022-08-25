// public class example {
//     public static void main(String[] args) {
//         int[] arr = {-100,-78,-54,-42,-35,-10,0,12,25,56,68,89,92,100};
//         int target = 11;
//         // int ans = ceilingofNumber(arr, target);
//         System.out.println(ceilingofNumber(arr, target));
//     }
//     static int ceilingofNumber(int[] arr, int target){
//         int start =0;
//         int end = arr.length-1;
//         if(target>arr[arr.length-1]){
//             return -1;
//         }
//         while(start<end){
//             int mid = start + (end-start)/2;
//             if(target==arr[mid]){
//                 return mid;
//             }
//             if(target>arr[mid]){
//                 start=mid+1;
//             }
//             if(target<arr[mid]){
//                 end=mid;
//             }
//         }
//         return end;
//     }
// }


public class example {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,1};
        System.out.println(peakInMountainArray1(arr));
    }
    static int peakInMountainArray1(int[] arr){
        int start =0;
        int end=arr.length-1;
        int ans = -1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid-1]>arr[mid]){
                end=mid-1;
            }
            if(arr[mid-1]<arr[mid]){
                ans=mid;
                start=mid;
            }
        }
        return ans;
    }
}
