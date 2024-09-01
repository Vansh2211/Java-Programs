public class CopyElements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7};
        int[] b = new int[a.length];

        b=a;
        b[0]++;

        System.out.println("elements of a are "+ a);
        for(int i=0;i<a.length;i++){
            System.out.print(a);
        }
        System.out.println("\n\ncopied elements:" + b);
        for(int i=0;i<b.length;i++){
            System.out.print(b);
        }
    }
}
