import java.util.ArrayList;

public class sprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(0,spiralOrder(matrix));
        System.out.println(spiralOrder(matrix));
    }
    static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int rowT=0;
        int colL=0;
        int rowB = matrix.length;
        int colR = matrix[0].length;
        while(rowT<=rowB)
        {
            for (int i = colL; i < colR; i++) {
                list.add(matrix[rowT][i]);
            }
            for (int i = rowT+1; i <rowB; i++) {
                list.add(matrix[i][colR-1]);
            }
            for (int j = colR-1-1; j > colL; j--) {
                list.add(matrix[rowB-1][j]);
            }
            for (int i = rowB-1; i > rowT; i--) {
                if(rowB==2){
                        continue;
                }
                list.add(matrix[i][colL]);
            }
            rowT++;
            colL++;
            rowB--;
            colR--;
        }
       
        return list;
    }
    
}