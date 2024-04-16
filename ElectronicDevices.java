public class ElectronicDevices {
    static String name;
    static String color;
    static String type;
    static int storage;

    public ElectronicDevices(String n, String c, String t, int s) {
        name = n;
        color = c;
        type = t;
        storage = s;
    }

    public void printData() {
        System.out.println(name + " " + color + " " + type + " " + storage);
    }

    public static void main(String[] args) {
        iPhone phone1 = new iPhone("Blue", 128, true);
        Android phone2 = new Android("Red", 256, false);

        Mac computer1 = new Mac("White", 1024, false);
        Windows computer2 = new Windows("Black", 512, true);

        ElectronicDevices watch = new ElectronicDevices("Apple Watch", "Black", "Watch", 24);

        phone1.printData();
        phone2.printData();
        computer1.printData();
        computer2.printData();
    }
}

class Phone extends ElectronicDevices {
     boolean sim;

    public Phone(String n, String c, int s, boolean sim) {
        super(n, c, "Phone", s);
        this.sim = sim;
    }
}  

class Computers extends ElectronicDevices {
    boolean externalDisplays;

    public Computers(String n, String c, int s, boolean d) {
        super(n, c, "Computer", s);
        externalDisplays = d;
    }
}

class iPhone extends Phone {
    public iPhone(String c, int s, boolean sim) {
        super("iPhone", c, s, sim);
    }

    public void printData() {
        System.out.println(name + " " + color + " " + type + " " + storage + " " + sim);
    }
}

class Android extends Phone {
    public Android(String c, int s, boolean sim) {
        super("Android", c, s, sim);
    }

    public void printData() {
        System.out.println(name + " " + color + " " + type + " " + storage + " " + sim);
    }
}

class Mac extends Computers {
    public Mac(String c, int s, boolean d) {
        super("Mac", c, s, d);
    }

    public void printData() {
        System.out.println(name + " " + color + " " + type + " " + storage + " " + externalDisplays);
    }
}

class Windows extends Computers {
    public Windows(String c, int s, boolean d) {
        super("Windows", c, s, d);
    }

    public void printData() {
        System.out.println(name + " " + color + " " + type + " " + storage + " " + externalDisplays);
    }
}