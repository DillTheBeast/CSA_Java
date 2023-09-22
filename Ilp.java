import java.util.Scanner;

public class Ilp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 2 numbers:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }
        else if(x < y) {
            System.out.println(x + " is less than " + y);
        }
        else {
            System.out.println(x + " is equal to " + y);
        }
    
    }
}
