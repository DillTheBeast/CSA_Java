public class Arithmatic {
    public static void main(String[] args) {
        Add num1 = new Add(2, 1);
        System.out.println(num1.method());
        Subract num2 = new Subract(2, 1);
        System.out.println(num2.method());
        Multiplication num3 = new Multiplication(2, 1);
        System.out.println(num3.method());
        Division num4 = new Division(2, 1);
        System.out.println(num4.method());
    }
}

class Add {
    int num1;
    int num2;
    public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Integer method() {
        return num1 + num2;
    }
}

class Subract {
    int num1;
    int num2;
    public Subract(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Integer method() {
        return num1 - num2;
    }

}

class Multiplication {
    int num1;
    int num2;
    public Multiplication(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Integer method() {
        return num1 * num2;
    }
}

class Division {
    int num1;
    int num2;
    public Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Integer method() {
        return num1 / num2;
    }
}
