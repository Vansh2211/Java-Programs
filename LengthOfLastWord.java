class Solution {
    static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else if(length>0){
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Vansh is good coder"));
    }
}