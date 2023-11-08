package Submit1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int end = factorial(x, x);
        System.out.println(end);
    }
    public static int factorial(int x, int i) {
        if(x == 1) return i;
        return factorial(x - 1, i *= x - 1);
    }
}
