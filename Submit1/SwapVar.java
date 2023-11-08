package Submit1;
import java.util.Scanner;

public class SwapVar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x then y and I will swap them");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int holder = x;
        x = y;
        y = holder;
        System.out.println("x " + x + " y " + y);
    }
}
