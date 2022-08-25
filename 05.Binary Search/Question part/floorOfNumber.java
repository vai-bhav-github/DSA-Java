public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = {-100,-78,-54,-42,-35,-10,0,12,25,56,68,89,92,100};
        int target = 1000;
        System.out.println(floorofNumber(arr, target));
    }   
    static int floorofNumber(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            } else{
                return mid;
            }
        }
        return end;
    }
}
