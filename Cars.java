public class Cars {
    //Electric = time and charge
    //Non-Electric = time and gas
    //Hybrig = time gas and charge
    public static void main(String[] args) {
        Electric car1 = new Electric(3, 2);
        car1.info();
        NonElectric car2 = new NonElectric(4, 5);
        Hybrid car3 = new Hybrid(6, 7, 8);
    }
}

class Electric {
    int time;
    private int charge;
    public Electric(int time, int charge) {
        this.time = time;
        this.charge = charge;
    }
    public void info() {
        System.out.println("The charge is " + charge);
    }
}

class NonElectric {
    int time;
    int gas;

    public NonElectric(int time, int gas) {
        this.time = time;
        this.gas = gas;
    }
}
class Hybrid {
    int time;
    int gas;
    int charge;

    public Hybrid(int time, int gas, int charge) {
        this.time = time;
        this.gas = gas;
        this.charge = charge;
    }
}
