import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //Triangle
        /*
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < y+1; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        //Pyramid
        /*
        for (int y = 1; y <= n; y++) {
            // Print spaces
            for (int x = 1; x <= n - y; x++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int x = 1; x <= y; x++) {
                System.out.print("*");
                if (x != y) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
        //Triangle with numbers
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < y+1; x++) {
                System.out.print(x+1);
            }
            System.out.println();
        }

    }

}