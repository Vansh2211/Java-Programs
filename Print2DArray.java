
import java.io.IOException;
import java.util.Arrays;

public class Print2DArray {
    public static void print2d(int[][] mat){

        for(int[] row:mat){
            System.out.println(Arrays.toString(row));
        }
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[i].length;j++){
        //         System.out.print(mat[i][j] + "");
        //     }
        // }
    }
    public static void main(String[] args) throws IOException {
        int mat[][] = {{1,2,3,4}
                      ,{4,5,6,7},
                       {6,7,8,9}};
        print2d(mat);
    }
}
