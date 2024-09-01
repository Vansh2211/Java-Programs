

public class RegEx{
    public static void main(String[] args){

        String s = "#@#$$#$#$ 12345 ascvbfgh";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        // Pattern pattern = Pattern.compile("Vansh",Pattern.CASE_INSENSITIVE);
        // Matcher matcher = pattern.matcher("He is Boy");
        // boolean matchfound = matcher.find();

        // if(matchfound){
        //     System.out.println("Match Found");
        // }
        // else{
        //     System.out.println("Match not found");
        // }
    }
}