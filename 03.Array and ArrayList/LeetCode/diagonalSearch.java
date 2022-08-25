public class diagonalSearch {
    // https://leetcode.com/problems/matrix-diagonal-sum/
    public static void main(String[] args) {
        int[][] arr ={
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        } ;
        System.out.println(diagonalSum(arr));
    }

    static int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;
        if(mat.length%2==0){
            for (int i = 0; i < mat.length; i++) {
                sum1+=mat[i][i];
                sum2+=mat[i][(mat.length)-i-1];
            }
            return sum1+sum2;
        } else{
            for (int i = 0; i < mat.length; i++) {
                sum1+=mat[i][i];
                sum2+=mat[i][(mat[i].length)-i-1];
            }
            return sum1+sum2-mat[mat.length/2][mat.length/2];
        }
  
        
    }

}
