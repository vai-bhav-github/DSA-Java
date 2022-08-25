public class SearchInRange {
  public static void main(String[] args) {
    int[] arr = {1,2,5,4,52,5,5698,12,5896,32547};
    int target =12;
    int start = 2;
    int end = 8;
    int ans = searchInRange(arr, target, start, end);
    System.out.println(ans);
    
  } 
  static int searchInRange(int[] arr, int target, int start, int end) {
    if(arr.length==0){
        return -1;
    }
    if(start>end){
        return -1;
    }
    for(int i=start;i<=end;i++)
    {
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
  }
}
