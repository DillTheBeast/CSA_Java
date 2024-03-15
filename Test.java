public class Test {
    public static void main(String[] args) {
        A a = new B();
    }
}

class A {
    public void getInfo() {
        System.out.println("A");
    }
}

class B extends A {
    public void getInfo() {
        System.out.println("B");
    }
}

class C extends B {
    public void getInfo() {
        System.out.println("C");
    }
}