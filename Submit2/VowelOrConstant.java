package Submit2;
import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input a character from the user
        System.out.print("Enter a character: ");
        String input = scan.nextLine();
        char inputChar = input.charAt(0);

        // Check if the entered character is a vowel or a consonant
        if (isVowel(inputChar)) {
            System.out.println(inputChar + " is a vowel.");
        } else {
            System.out.println(inputChar + " is a consonant.");
        }
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        // Convert the character to lowercase to handle both uppercase and lowercase inputs
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
