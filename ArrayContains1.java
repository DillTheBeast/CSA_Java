import java.util.Scanner;

public class ArrayContains1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] baseArray = new String[6];

        //Add letters to the array
        for (int i = 0, a = 'a'; i < baseArray.length; i++, a++) {
            baseArray[i] = String.valueOf((char) a);
        }

        // Ask the user for a string
        System.out.print("Enter a string to check if it is in baseArray: ");
        String userInput = scan.nextLine();

        // Check if the entered string is in baseArray
        boolean containsString = false;
        for (int i = 0; i < baseArray.length; i++) {
            if (baseArray[i].equals(userInput)) {
                containsString = true;
                break;
            }
        }

        // Display the result
        if (containsString) {
            System.out.println("baseArray contains the entered string.");
        } else {
            System.out.println("baseArray does not contain the entered string.");
        }
    }
}
