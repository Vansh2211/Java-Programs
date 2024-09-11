import java.util.*;
public class NoOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String name = sc.next();

        int count = 0;
        int index = 0;

        while((index = text.indexOf(name,index)) != -1){
            count++;
            index += name.length();
        }

        System.out.println(count);
    }
}
