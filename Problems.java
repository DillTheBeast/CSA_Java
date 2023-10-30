import java.util.Scanner;

public class Problems {
    //Take in a string of 5 numbers
    //Can be double or float
    //String should look like "52834"
    //Sort from least to greatest
    //Goes to "23458"
    public static void main(String[] args) throws InterruptedException {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Type 1: Pie Memory, 2: GCF, 3: LCM");
        int choice = Scan.nextInt();
        if(choice == 1) {
            //Memory
            memory();
        } else if(choice == 2) {
            //GCF
            int x = gcf();
            System.out.println("The gcf is " + x);
        } else if(choice == 3) {
            //LCM
            int x = lcm();
            System.out.println("The lcm is " + x);
        }
    }
    public static void memory() throws InterruptedException {
        String pie = "3.1415926535";
        Scanner Scan = new Scanner(System.in);
        for(int i = 1; i < pie.length(); i++) {
            String current = pie.substring(0,i);
            System.out.println(current);
            Thread.sleep(2000);  // Wait for 2 seconds

            //Deleting printed number
            System.out.println("\033[H\033[2J)");
            System.out.println("What was just said: ");
            String said = Scan.nextLine();
            if(!said.equals(current)) {
                System.out.println("Nope");
                System.exit(1);
            }
            Thread.sleep(1000);
            System.out.println("\033[H\033[2J)");
        }
        System.out.println("Nice you completed it");
    }
    public static Integer gcf() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("What 2 numbers would you like to the find gcf of: ");
        int num1 = Scan.nextInt();
        int num2 = Scan.nextInt();
        return findGCF(num1, num2);
    }
    public static int findGCF(int a, int b) {
        //Base case saying if b is zero than a is gcf
        if (b == 0) {
            return a;
        } else {
            return findGCF(b, a % b);
        }
    }

    public static Integer lcm() {
        //Know that LCM = (a*b)/(gcf(a, b))
        Scanner Scan = new Scanner(System.in);
        System.out.println("What 2 numbers would you like to the find lcm of: ");
        int num1 = Scan.nextInt();
        int num2 = Scan.nextInt();
        return findLCM(num1, num2);
    }
    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findGCF(a, b);
    }
}
