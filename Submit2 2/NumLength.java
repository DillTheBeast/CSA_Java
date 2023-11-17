package Submit2;
import java.util.Scanner;

public class NumLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int length = String.valueOf(number).length();
        System.out.println("The length of the number is: " + length);
    }
}
