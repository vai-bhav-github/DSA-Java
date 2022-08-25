public class validPerfectSquare {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {     
        long start =1;
        long end = num;
        while(start<=end){
            long mid = start +(end-start)/2;
            long msq = mid*mid;
            if(msq==num){
                return true;
            }
            if(msq<num){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return false;
    }
}
