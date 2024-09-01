import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    
    public static void findCommon(String[] arr1,String[] arr2){
        Set<String> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){

                    set.add(arr1[i]);
                    break;
                }
            }
        }

        for(String i:set){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
         String arr1[] = {"Java","Python","C++"};
         String arr2[] = {"Javascript","Python","Node","C++"};

         findCommon(arr1, arr2);
    }
}
