
public class Vowel {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if(n == 'a' || n=='e'|| n=='i'|| n=='o'|| n=='u'){
        //     System.out.println("It is Vowel");
        // }
        // else{
        //     System.out.println("It is Consonant");
        // }

        static void VowelOrConst(char n){
            if(n == 'a' || n=='e'|| n=='i'|| n=='o'|| n=='u'){
                    System.out.println("It is Vowel");
                }
            else{
                 System.out.println("It is Consonant");
        }
        }
        public static void main(String[] args) {
            VowelOrConst('b');
            VowelOrConst('i');
        }
}
