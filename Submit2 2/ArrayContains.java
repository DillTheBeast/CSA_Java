package Submit2;
import java.util.Scanner;

public class ArrayContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int target = 1;

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Give me a number");
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("The array contains a " + target);
            }
        }
    }
}
