package Submit1;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);
            int numericDigit = Character.getNumericValue(digit); // Convert char to int
            System.out.println(numericDigit);
        }
    }
}
