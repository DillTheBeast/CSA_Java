package Submit1;
import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        if(str.isEmpty()) System.out.println("String is empty");
        else System.out.println("String has something");
    }
}
