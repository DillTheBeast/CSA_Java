public class Cars {
    //Electric = time and charge
    //Non-Electric = time and gas
    //Hybrig = time gas and charge
    public static void main(String[] args) {
        Electric car1 = new Electric(3, 2, "White");
        car1.info();
        NonElectric car2 = new NonElectric(4, 5);
        car2.info();
        NonElectric car4 = new NonElectric("Blue");
        car4.info();
        Hybrid car3 = new Hybrid(6, 7, 8, "Blue");
        car3.info();
    }
}

class Electric {
    int time;
    private int charge;
    String color;
    public Electric(int time, int charge, String color) {
        this.time = time;
        this.charge = charge;
        this.color = color;
    }
    public void info() {
        System.out.println("The charge is " + charge + " and the time is " + time + " and the color is " + color);
    }
}

class NonElectric {
    int time;
    int gas;
    String color;

    public NonElectric(int time, int gas) {
        this.time = time;
        this.gas = gas;
    }
    public NonElectric(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("The gas is " + gas + " and the time is " + time + " and the color is " + color);
    }
}
class Hybrid {
    int time;
    int gas;
    int charge;
    String color;

    public Hybrid(int time, int gas, int charge, String color) {
        this.time = time;
        this.gas = gas;
        this.charge = charge;
        this.color = color;
    }
    public void info() {
        System.out.println("The gas is " + gas + " and the time is " + time + " and the charge is " + charge + " and the color is " + color);
    }
}
