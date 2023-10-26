import java.io.IOException;
import java.util.Scanner;

public class Problems {
    //Take in a string of 5 numbers
    //Can be double or float
    //String should look like "52834"
    //Sort from least to greatest
    //Goes to "23458"
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Type 1: Pie Memory, 2: GCF, 3: LCM");
        int choice = Scan.nextInt();
        if(choice == 1) {
            //Memory
            memory();
        } else if(choice == 2) {
            //GCF
        } else if(choice == 3) {
            //LCM
        }
        memory();
    }
    public static void memory() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Hello");
        System.out.flush();
    }
    public static Integer gcf() {
        return null;
    }
    public static Integer lcm() {
        return null;
    }
}
