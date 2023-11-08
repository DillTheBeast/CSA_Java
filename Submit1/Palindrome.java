package Submit1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
//Declaring Variables
        Scanner Scan = new Scanner(System.in);
        String input;
        String input2 = "";

        System.out.println("Give me a word and I will test if it spells the same thing backwards");
        input = Scan.nextLine();
        for(int l = input.length() - 1; l >= 0; l--) {
            input2 += input.charAt(l);
        }
//Finding out if input is the same thing as the backwards input

        if(input .equals(input2)) {
            System.out.println(input + " backwords is " + input2);
            System.out.println("This means that " + input + " is a palindrome");
        }
//Finding out if input is not the same thing as the backwards input

        else {
            System.out.println(input + " backwords is " + input2);
            System.out.println("This means that " + input + " is not a palindrome");
        }

        int n = Scan.nextInt();
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
        

    }
}
