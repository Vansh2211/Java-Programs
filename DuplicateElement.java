import java.util.*;
public class DuplicateElement {

    public static void main(String[] args) {
        
        String langs[] = {"Java","Python","C++","Ruby","Java","Python"};
        
        for(int i=0; i<langs.length;i++){
            for(int j=i+1;j<langs.length;j++){
                if(langs[i] == langs[j]){
                    System.out.println("Duplicate element is:" + langs[i]);
                }
            }
        }

        Set<String> store = new HashSet<String>();
        for(String name:langs){
            if(store.add(name)==false){
                System.out.println("Duplicate is:" +name);
            }
        }
    }
}
