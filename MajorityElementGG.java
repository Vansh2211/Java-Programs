public class MajorityElementGG{

    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        // First pass: Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Second pass: Verify the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is a majority element
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 3, 2};
        int result = findMajorityElement(arr);
        System.out.println("Majority Element: " + result); // Output: 3
    }
}