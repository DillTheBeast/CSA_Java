

public class Quiz1Review {
    public static void main(String[] args) {
        B b = new B(3);
        b.s;
        System.out.println(b.getInfo());
        A a = new A(4);
    }
}

class A {
    private int a;
    String s;
    public A(int a1, String str) {
        a = a1;
        s = str;
    }

    public A(int a1) {
        a = a1;
    }
    public int getInfo() {
        return a;
    }
}

class B extends A {
    public B(int b1) {
        super(b1);
    }
    public int getInfo() {
        return super.getInfo();
    }
}