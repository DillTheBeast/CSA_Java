import java.util.Scanner;

public class ExponentsWithRecursion {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Give me the base");
        int base = Scan.nextInt();
        System.out.println("Give me the exponent");
        int exponent = Scan.nextInt();
        System.out.println(base + " to the " + exponent + " is " + power(base, base, 1, exponent));
    }
    public static int power(int w, int x, int y, int z) {
        if(y == z) {
            return x;
        }
        return power(w, x*w, y+1, z);
    }
}
