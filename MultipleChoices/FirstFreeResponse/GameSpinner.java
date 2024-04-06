import java.util.Random;

public class GameSpinner {
    private int numSectors;
    private int prevSpin;
    private int currentRunLength;

    public GameSpinner(int numSectors) {
        this.numSectors = numSectors;
        this.prevSpin = -1;
        this.currentRunLength = 0;
    }

    public int spin() {
        Random random = new Random();
        int spinResult = random.nextInt(numSectors) + 1;
        updateCurrentRun(spinResult);
        this.prevSpin = spinResult;
        return spinResult;
    }

    private void updateCurrentRun(int spinResult) {
        if (spinResult == prevSpin) {
            currentRunLength++;
        } else {
            currentRunLength = 1;
        }
    }

    public int currentRun() {
        return currentRunLength;
    }

    public static void main(String[] args) {
        GameSpinner g = new GameSpinner(4);

        System.out.println(g.currentRun());

        System.out.println(g.spin());
        System.out.println(g.currentRun());

        System.out.println(g.spin()); 
        System.out.println(g.currentRun());

        System.out.println(g.spin()); 
        System.out.println(g.currentRun()); 

        System.out.println(g.spin());
        System.out.println(g.currentRun());

        System.out.println(g.spin());
        System.out.println(g.spin()); 
        System.out.println(g.spin()); 
        System.out.println(g.currentRun());
    }
}
