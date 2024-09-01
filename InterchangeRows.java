
import java.io.IOException;

public class InterchangeRows {
    
    static void swap_firstandlast(int[][] mat){
        int rws = mat.length;

        for(int i=0;i<mat.length;i++){
            
                int temp = mat[0][i];
                mat[0][i] = mat[rws-1][i];
                mat[rws-1][i] = temp;
 
        }
    }

    public static void main(String[] args) throws IOException {
        
        int[][] mat = {{1,2,3,4},
                       {3,4,5,6},
                       {6,7,8,9}};

        swap_firstandlast(mat);

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){

                System.out.print(mat[i][j] + " ");

                System.out.println();
            }
        }
    }
}
