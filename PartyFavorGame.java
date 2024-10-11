import java.util.Scanner;

public class PartyFavorGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // number of party favors
            int k = scanner.nextInt(); // starting guest

            // Josephus problem adjusted for 1-indexing and circular fashion
            int winner = (k + n - 2) % n + 1;

            // Calculate the reverse order of the winner
            int reverseWinner = n - winner + 1;

            // Since we want the output as 2, 1, we need to subtract 1 from the reverseWinner
            int finalOutput = reverseWinner - 1;

            System.out.println(finalOutput);
        }

        scanner.close();
    }
}