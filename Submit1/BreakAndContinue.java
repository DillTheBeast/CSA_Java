package Submit1;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                continue; // Skip numbers less than or equal to 5
            }
            
            System.out.println("The first number greater than 5 is: " + i);
            break; // Exit the loop after finding the first number greater than 5
        }
    }
}
