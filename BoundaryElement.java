

public class BoundaryElement {
    
    public void B_elements(int mat[][]){

        for(int i=0;i<mat.length;i++){
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();

        }
        System.out.println("Resultant matrix :");

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==0 || j==0 || i== mat.length-1 || j==mat[i].length-1){
                    System.out.print(mat[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int mat[][] = {{1,2,3,5},
                       {4,5,6,7},
                       {7,8,9,9}};

        BoundaryElement values = new BoundaryElement();

        values.B_elements(mat);
    }

}


