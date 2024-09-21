public class CovertIntoRoman {
    
    static void intoRoman(int num){
        int n[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i=0;
        int M = 1000;
        int CM = 900;
        int D=500;
        int CD=400;
        int C=100;
        int XC=90;
        int L=50;
        int XL=40;
        int X=10;
        int IX=9;
        int V=5;
        int IV=4;
        int I=1;
        String str = new String();
        while(num>0){
            if(num>=n[i]){
                str = str+n[i];
                num -= n[i];
            }
            else{
                i++;
            }
        }
        System.out.println(str);;
    }

    public static void main(String[] args) {
        intoRoman(3749);
    }
}
