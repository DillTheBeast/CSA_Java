import java.util.ArrayList;

public class CarRepair {
    private int mechanicNum;
    private int bayNum;

    public CarRepair(int m, int b) {
        mechanicNum = m;
        bayNum = b;
    }

    public int getMechanicNum() {
        return mechanicNum;
    }

    public int getBayNum() {
        return bayNum;
    }

}

class Test {
    private ArrayList<CarRepair> schedule;
    public boolean addRepair(int m, int b) {
        if(schedule.contains(schedule[m].getMechanicNum()) || schedule.contains(b)) return false;
        else {
            schedule.add(new CarRepair(m, b));
            return true;
        }
    }

    public ArrayList<Integer> availableMechanics() {
        ArrayList<Integer> available = new ArrayList<Integer>();
        available.add(1);
        available.add(2);
        available.add(3);
        available.add(4);
        available.add(5);
        for(CarRepair r : schedule) {
            if(available.contains(r.getMechanicNum())) {
                available.remove(r.getMechanicNum());
            }
        }
        return available;

    }
}
