import java.util.*;
import java.io.*;
class QuickSort
{

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {

            if (arr[j] <= pivot)
            {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);


            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        do {
            System.out.print("Choose From This: \n1. Int Array \n2. Char Array\n--> ");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Enter the size of array:");
                    int a = sc.nextInt();
                    
                    int arr[] = new int[a];
                    int n = arr.length;

                
                    for (int i=0;i<a;i++)
                        arr[i]=rn.nextInt(100);
                    System.out.println("Randomly Generated Array is:");
                    for (int i=0;i<a;i++)
                        System.out.print(arr[i]+" ");

                    QuickSort ob = new QuickSort();
                    ob.sort(arr, 0, n-1);

                    System.out.println("\nsorted array");
                    printArray(arr);
                    if(a%2==0)
                    {
                        System.out.println("\nThe data of array is evenly distributed.\n");
                    }
                    else
                        System.out.println("\nThe data of array is unevenly distributed.\n");

                    break;
case 2:
                    System.out.println("Enter Char: ");
                    String str = sc.next();
                    char[] charArray = str.toCharArray();

                    // Displaying Array before Sorting
                    System.out.println("*Char Array Before Sorting*");
                    System.out.println(charArray);
                    System.out.println();
//                    for (char ch: charArray){
//                        System.out.println(ch);
//                    }
 // Sorting the Array
                    Arrays.sort(charArray);
                    System.out.println("*Char Array After Sorting*");
                    System.out.println(charArray);
                    System.out.println();
//                    for (char ch: charArray){
//                        System.out.println(ch);
//                    }
                    break;
}
  }while (0<1);
 }

}

