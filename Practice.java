

public class Practice {
    public static void Loop(){
    int n= 5;
    for(int i=0;i<n;i++){
        System.out.println(i + "");
    }
}

    static int sum(int p, int q){
        if(p<10){
            return p+q;
        }
        else{
            System.out.println("Number is greater than 10");
        }
        return 0;
    }

    public static void recursionPractice(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recursionPractice(n-1);
    }


    public static void main(String[] args) {
        // System.out.println("sum is " + sum(9, 9));
        recursionPractice(5);
    }
}
