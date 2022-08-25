 public class squareRoot {
    public static void main(String[] args) {
        int x =10;
        System.out.println(sqrRoot(x));
    }
    static int sqrRoot(int x){
        long int start =1;
        int end = x;
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int msq = mid*mid;
            if(msq==x){
                return mid;
            } else if(msq>x){
                end=mid-1;
            } else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
    
 }