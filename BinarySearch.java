// class BinarySearch{
//     public static void binarysearch(int arr[],int first,int last,int key){

//         int mid = (first + last)/2;
//         while(first <= last){
//             if(arr[mid]< key){
//                 first  = mid +1;
//             }
//             else if(arr[mid] == key){
//                System.out.println("Element found at "+mid); 
//             }
//             else{
//                 last = mid-1;
//             }
//             mid = (first+last)/2;

//         } 
//         if(first >last){
//             System.out.println("Element not found");


//         }
//     }
//  public static void main(String[] args) {
//         int arr[] = {10,21,34,30,65,40,50};
//         int key = 10;
//         int last = arr.length-1;
//         binarysearch(arr, 0, last, key);

//     }
// }

class BinarySearch{
    public static void main(String[] args) {
        int arr[] = {13,455,677,88,4,5};
        int target = 677;
        System.out.println(search(arr, target, 0, arr.length-1));

    }

    static int search(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(target>arr[mid]){
            search(arr, target, mid +1, e);
        }
        
           return search(arr, target, s, mid-1);
        
    }
}