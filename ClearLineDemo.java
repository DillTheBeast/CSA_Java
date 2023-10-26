public class ClearLineDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Hello");
        Thread.sleep(2000);  // Wait for 2 seconds

        // Use ANSI escape codes to move the cursor up, clear the line, 
        // and then move the cursor to the beginning of the line
        System.out.print("\033[1A");  // Move cursor up by 1 line
        System.out.print("\033[2K");  // Clear the entire line
        System.out.print("\033[1G");  // Move cursor to column 1
    }
}
