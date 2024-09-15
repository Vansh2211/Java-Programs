import java.util.Scanner;

public class ReplaceAllOddAndEvenElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the array size and elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 2: Find the minimum and maximum elements in the array
        int minElement = arr[0];
        int maxElement = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Step 3: Replace odd elements with minimum and even elements with maximum
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) { 
                arr[i] = maxElement; // Replace even elements with max
            } else { 
                arr[i] = minElement; // Replace odd elements with min
            }
        }

        // Step 4: Output the modified array
        System.out.println("Modified array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
