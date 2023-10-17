public class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Animals anim = new Animals("Scooby Doo");
        Mammals mammals = new Mammals(true, 2, 3);
        Reptiles reptiles = new Reptiles(true, 4, 5);

    }
}

class Mammals {
    boolean fur;
    int length;
    int height;
    public Mammals(boolean fur, int length, int height) {
        this.fur = fur;
        this.length = length;
        this.height = height;
    }
}

class Reptiles {
    boolean scales;
    int length;
    int height;
    public Reptiles(boolean scales, int length, int height) {
        this.scales = scales;
        this.length = length;
        this.height = height;
    }
}
