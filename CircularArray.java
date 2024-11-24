public class CircularArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int index = 8;

        System.out.println(circularArray(arr, index));
    }

    static int circularArray(int arr[],int index){

        int cirIndex;

        for(int i=0;i<arr.length-1;i++){
            cirIndex = index%arr.length;
            index = cirIndex;
        }

        return arr[index];
    }
}
