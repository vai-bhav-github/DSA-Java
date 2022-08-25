public class searchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr= {1,5,6,8,9,10,23,35,45,56,67,79,82,90,100,101};
        System.out.println(searchInInfiniteArray1(arr, 5));
    }
    static int searchInInfiniteArray1(int arr[],int target){
        int start = 0;
        int end =1;
        while(target>arr[end]){
            int newstart =end+1;
            end = end+(end-start+1)*2;
            start = newstart;
        }
        return binarysearch(arr, target,start,end);
    }
    static int binarysearch(int[] arr, int target,int start,int end){
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
        return -1;
    }
}
