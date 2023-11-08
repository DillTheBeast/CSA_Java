package Submit1;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int holder = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Give me a number with digits 1 by 1:");
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < arr.length/2; i++) {
            holder = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = holder;
        }
        System.out.println("Your new array is:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}