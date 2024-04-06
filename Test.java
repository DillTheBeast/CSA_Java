public class Test {
    public static void main(String[] args) {
        
    }
}

class Animal {
    String type;
    String species;
    String name;

    public Animal(String t, String s, String n) {
        type = t;
        species = s;
        name = n;
    }

    public void toStrings() {
        System.out.println("sdfsdfsdf");
    }
}

class Herbivore extends Animal {

    public Herbivore(String t, String n) {
        super(t, "Herbivore", n);
    }

    public void toStrings() {
        System.out.println("sdfsdfsdf");
    }
}

class Elephant extends Herbivore {
    double length;

    public Elephant(String n, double l) {
        super("Elephant", n);
        length = l;
    }

    public void toStrings() {
        System.out.println(name + " the " + species + " is a " + type + " with " + length);
    }
}