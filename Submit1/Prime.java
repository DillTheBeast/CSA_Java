package Submit1;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        boolean found = false;
        for(int i = 2; i < x - 1; i++) {
            if(x % i == 0) {
                System.out.println("Not Prime");
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Prime");
    }
}
