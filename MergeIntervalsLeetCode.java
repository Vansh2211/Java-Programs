
import java.util.*;

public class MergeIntervalsLeetCode {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,15},{16,20}};
        int[][] mergedInt = mergeIntervals(intervals);
        System.out.println(mergeIntervals(intervals));

        for(int[] interval : intervals){
            System.out.println(Arrays.toString(interval));
        }
    }

    static int[][] mergeIntervals(int[][] intervals){

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for(int[] interval: intervals){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0]){
                merged.add(interval);
            }
            else{
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1],interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);

    }
}
