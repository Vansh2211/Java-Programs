
import java.util.HashMap;
import java.util.*;

public class CountDuplicateWords {
    
    public static void findDuplicateWords(String inputString){

        String words[] = inputString.split(" ");

        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        


        for(String word : words){

            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
            }
            else{
                wordCount.put(word, 1);
            }
        }

        Set<String> wordInStrings = wordCount.keySet();

        for(String word : wordInStrings){
            if(wordCount.get(word)>1){
                System.out.println(word + ":" + wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {
        
        // findDuplicateWords("My Vansh is Vansh is name");
        findDuplicateWords("is is is is");
    }
}
