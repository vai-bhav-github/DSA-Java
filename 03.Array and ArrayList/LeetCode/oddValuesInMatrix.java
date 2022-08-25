public class oddValuesInMatrix {
    public static void main(String[] args) {
        // https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
        int[][] indices = {
                    {0,1},
                    {1,1}
        };
        System.out.println(oddCells(2, 3, indices));
        
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrixzero = new int[m][n];
        for (int i = 0; i < matrixzero.length; i++) {
            for (int j = 0; j < matrixzero[i].length; j++) {
                matrixzero[i][j]=0;
            }
        }

        for (int i = 0; i < indices.length; i++) {
            int rowInd =indices[i][0];
            for (int j = 0; j < matrixzero[rowInd].length; j++) {
                matrixzero[rowInd][j]=matrixzero[rowInd][j]+1;
            }
        }
        for (int i = 0; i < indices.length; i++) {
            int colInd = indices[i][1];
            for (int j = 0; j < matrixzero.length; j++) {
                matrixzero[j][colInd]=matrixzero[j][colInd]+1;
            }
        }
        int count=0;
        for (int i = 0; i < matrixzero.length; i++) {
            for (int j = 0; j < matrixzero[i].length; j++) {
                if(matrixzero[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;

        // Optimised Solution from leetcode

//         //         int[][]mat  = new int[m][n];
// //         int row=0,col=0;
// //         for(int i=0;i<indices.length;i++){
// //             row = indices[i][0];//0 because indices[i] = [ri,ci] since only two values
// //             //assigning values to matrix row
// //             for(int j=0;j<mat[0].length;j++){
// //                 mat[row][j] = mat[row][j]+1; 
// //             }
// //             col = indices[i][1];
// //             //assigning column values
// //             for(int j=0;j<mat.length;j++){
// //                 mat[j][col]++;
// //             }
// //         }
// //         int count=0;
// //         for(int i=0;i<mat.length;i++){
// //             for(int j=0;j<mat[0].length;j++){
// //                 if((mat[i][j]%2)!=0){
// //                     count++;
// //                 }
// //             }
// //         }
        
        
// int [] row = new int[m];
// int [] col = new int[n];
// for(int i=0;i<indices.length;i++){
//     row[indices[i][0]]++;
//     col[indices[i][1]]++;
// }
// int count=0;
// for(int i=0;i<row.length;i++){
//     for(int j=0;j<col.length;j++){
//         if((row[i]+col[j])%2!=0){
//             count++;
//         }
//     }
// }

// return count;
    }
}
