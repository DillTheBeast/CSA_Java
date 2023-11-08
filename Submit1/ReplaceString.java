package Submit1;
import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        str = str.replace("T", "@");
        str = str.replace("t", "@");
        System.out.println(str);
    }
}
