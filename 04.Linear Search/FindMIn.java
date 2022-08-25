public class FindMIn {
    public static void main(String[] args) {
        int[] arr = {1,2,5,-9,36,89,568};
        int ans = findMin(arr);
        System.out.println(ans);
    }
    static int findMin(int[] arr)
    {
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
            
        }
        return min;
    }
}
