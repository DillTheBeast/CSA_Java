import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        //Triangle
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < y+1; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
