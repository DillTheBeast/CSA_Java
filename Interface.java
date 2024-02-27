public class Interface {
    public static void main(String[] args) {
        // C obj = new C();
        // obj.PrintUserInfo();
        // String userName = obj.GetUserName();
        // boolean subscription = obj.UserSubscription();
        Animal obj = new Animal();
        System.out.println(obj.dogNoise());
        System.out.println(obj.catNoise());
        System.out.println(obj.pigNoise());
    }
}

interface dog {
    public String dogNoise();
}

interface cat {
    public String catNoise();
}

interface pig {
    public String pigNoise();
}

class Animal implements dog, cat, pig{
    public String pigNoise() {
        return "Oink";
    }
    public String dogNoise() {
        return "Woof";
    }
    public String catNoise() {
        return "Meow";
    }
    public String cowNoise() {
        return "Moo";
    }
}
/*
interface A {
    public void PrintUserInfo();
    public String GetUserName();
}

interface B {
    public boolean UserSubscription();
}

class C implements A, B {
    public void PrintUserInfo() {
        System.out.println("Test");
    }
    public boolean UserSubscription() {
        return true;
    }
    public String GetUserName() {
        return "Test";
    }
}
*/