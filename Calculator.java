import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("int, float, double, or long");
        int choice = scan.nextInt();
        if(choice == 1) {
            System.out.println("Number 1");
            int number = scan.nextInt();
            System.out.println("Number 2");
            int number2 = scan.nextInt();
            System.out.println("Addition, Subtraction, Multiplication, or Division");
            int op = scan.nextInt();
            int x = math(number, number2, op);
            System.out.println(x);
        } else if (choice == 2) {
            System.out.println("Number 1");
            float number = scan.nextFloat();
            System.out.println("Number 2");
            float number2 = scan.nextFloat();
            System.out.println("Addition, Subtraction, Multiplication, or Division");
            int op = scan.nextInt();
            float x = math(number, number2, op);
            System.out.println(x);
        } else if (choice == 3) {
            System.out.println("Number 1");
            double number = scan.nextDouble();
            System.out.println("Number 2");
            double number2 = scan.nextDouble();
            System.out.println("Addition, Subtraction, Multiplication, or Division");
            int op = scan.nextInt();
            double x = math(number, number2, op);
            System.out.println(x);
        } else if (choice == 4) {
            System.out.println("Number 1");
            long number = scan.nextLong();
            System.out.println("Number 2");
            long number2 = scan.nextLong();
            System.out.println("Addition, Subtraction, Multiplication, or Division");
            int op = scan.nextInt();
            double x = math(number, number2, op);
            System.out.println(x);
        }
    }

    public static Integer math(int number1, int number2, int op1) {
        switch (op1) {
            case(1):
                return number1 + number2;
            case(2):
                return number1 - number2;
            case(3):
                return number1 * number2;
            case(4):
                return number1 / number2;
        }
        return null;
    }
    public static Float math(float number1, float number2, float op1) {
        int op = (int) Math.round(op1);
        switch (op) {
            case(1):
                return number1 + number2;
            case(2):
                return number1 - number2;
            case(3):
                return number1 * number2;
            case(4):
                return number1 / number2;
        }
        return null;

    }
    public static Double math(double number1, double number2, double op1) {
        int op = (int) Math.round(op1);
        switch (op) {
            case(1):
                return number1 + number2;
            case(2):
                return number1 - number2;
            case(3):
                return number1 * number2;
            case(4):
                return number1 / number2;
        }
        return null;

    }
    public static Long math(long number1, long number2, long op1) {
        int op = (int) Math.round(op1);
        switch (op) {
            case(1):
                return number1 + number2;
            case(2):
                return number1 - number2;
            case(3):
                return number1 * number2;
            case(4):
                return number1 / number2;
        }
        return null;

    }
}
