import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers[] = new int[3];
        boolean found = false;
        for(int i = 0; i < 3; i++) {
            numbers[i] = scan.nextInt();
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 2; j < numbers[i] - 1; j++) {
                if(numbers[i] % j == 0) {
                    System.out.println(numbers[i] + " is not prime");
                    found = true;
                    break;
                }
                if(!found) {
                    System.out.println("Prime");
                }
                found = false;
            }
        }
    }
}