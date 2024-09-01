import java.util.Scanner;

public class Pattern {


        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

       int sp = 0;
       int st = n;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
            System.out.print("\t");
        }

        for(int j=1;j<=st;j++){
            System.out.print("*\t");
        }

        sp++;
        st--;
        System.out.println(); 
       }
    }
}


