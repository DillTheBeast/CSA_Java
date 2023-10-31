public class Animal {
    public static void main(String[] args) {
        A animal = new A();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}

class Dog extends A {
    // public void sound() {
    //     System.out.println("Ruff");
    // }
}

class Cat extends A {
    // public void sound() {
    //     System.out.println("Meow");
    // }
}

class A {
    public void sound() {
         System.out.println("Each and every animal has a sound");
    }
}


