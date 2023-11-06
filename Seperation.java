import java.util.Scanner;

public class Seperation {
    public static void main(String[] args) {
        //seperateSentence();
        seperateEmail();
    }

    public static void seperateSentence() {
        Scanner scan = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        // Call the method to separate words
        String[] words = sentence.split(" ");

        // Print the separated words
        System.out.println("Separated words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void seperateEmail() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a email address: ");
        String email = scan.nextLine();

        String[] words = email.split("@");

        System.out.println("Separated words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}