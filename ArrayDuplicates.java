import java.util.*;
public class ArrayDuplicates {
    
    static ArrayList<Integer> arrayDuplicates(int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int num:arr){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
           if(entry.getValue()>1){
            duplicates.add(entry.getKey());
           }
        }

        if(duplicates.isEmpty()){
            duplicates.add(-1);
        }

        Collections.sort(duplicates);

        return duplicates;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4};
        System.out.println("duplicate elements are " + arrayDuplicates(arr));
    }
}
