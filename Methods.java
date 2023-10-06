import java.util.Scanner;

public class Methods {
    // public static void main(String[] args) {
    //     int x = addNumber();
    //     System.out.println(printThis());
    //     System.out.println(x);
    // }
    // public static Integer addNumber() {
    //     Scanner Scan = new Scanner(System.in);
    //     int x = Scan.nextInt();
    //     int y = Scan.nextInt();
    //     return x + y;
    // }
    // public static String printThis() {
    //     return "Hello";
    // }
    public static void main(String[] args) {
        boolean x = prime();
        System.out.println(x);
    }
    public static boolean prime() {
        Scanner Scan = new Scanner(System.in);

        int n = Scan.nextInt();
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
