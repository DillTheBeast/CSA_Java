public class FibonacciSequence {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 0; i <= 10; i++) {
            z = x + y;
            System.out.print(z + ", ");
            x = y;
            y = z;
        }
    }
}