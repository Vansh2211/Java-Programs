public class SecondLargestElement {

    public int getSecondLargest(int[] arr) {
        // Code Here
        Integer largest = null;
        Integer secLargest = null;
        
        for(int num:arr){
            if(largest == null || num>largest){
                secLargest = largest;
                largest = num;
            }
            else if(num<largest){
                if(secLargest == null || num>secLargest){
                    secLargest = num;
                }
            }
        }
        return (secLargest!=null) ? secLargest:-1;
        
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        SecondLargestElement sc = new SecondLargestElement();

        System.out.println(sc.getSecondLargest(arr));
    }
}
