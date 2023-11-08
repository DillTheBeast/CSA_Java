package Submit1;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String word = scan.nextLine();

        System.out.println(sentence.indexOf(word));
    }
}
