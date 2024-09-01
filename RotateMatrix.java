public class RotateMatrix {

    static int r = 4;
    static int c = 4;
      
    static void rotateMat(int p,int q,int matrix[][]){

        int rw =0; int cl=0;
        int previous,current;

        while(rw<p || cl<q) {
            if(rw+1 == p || cl+1 == q){
                break;
            }

            previous = matrix[rw+1][q];

            for(int x= cl;x<q;x++){
                current = matrix[rw][x];
                matrix[rw][x] = previous;
                previous= current;
            }
            rw++;

            for (int x = rw; x < p; x++) {
                current = matrix[x][q-1];
                matrix[x][q-1] = previous;
                previous= current;
            }
            q--;

            if (rw < p) {
                for (int x = q - 1; x >= cl; x--) {
                    current = matrix[p - 1][x];
                    matrix[p - 1][x] = previous;
                    previous = current;
                }
            }
            p--;
 
            // Moving elements of the first column
            // from rest of the rows
            if (cl < q) {
                for (int x = p - 1; x >= rw; x--) {
                    current = matrix[x][cl];
                    matrix[x][cl] = previous;
                    previous = current;
                }
            }
            cl++;
        }
 
        // Prints the rotated matrix
        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++)
                System.out.print(matrix[x][y] + " ");
            System.out.print("\n");
        }
    }
     
    public static void main(String[] args)
    {
 
        // Custom input array
        int b[][] = { { 5, 6, 7, 8 },
                      { 1, 2, 3, 4 },
                      { 0, 15, 6, 5 },
                      { 3, 1, 2, 12 } };
 
        // Calling function(Method1) to rotate matrix
        rotateMat(r, c, b);
    }
 }

