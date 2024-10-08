import java.util.*;

public class NextGreaterElement {
    

    static int[] nextGE(int[] arr){
        int[] nge = new int[arr.length-1];

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        nge[arr.length-1] = -1;

        for(int i=arr.length-2;i>=0;i--){

            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }

            if(st.size() == 0){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,5,9,3,1,12};

        nextGE(arr);
    }
}
