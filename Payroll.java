public class Payroll {
    private int[] itemsSold;
    private double[] wages;
    public static void main(String[] args) {

    }
    
    public double computeBonusThreshold() {
        double sum = 0.0;
        int bottom = 0;
        int top = 0;
        for(int i : itemsSold) {
            sum += i;
            if(i > top) top = i;
            if (i < bottom) bottom = i;
        }
        sum -= top;
        sum -= bottom;
        return sum / (itemsSold.length - 2);
    }

    public void computeWages(double fixedWage, double perItemWage) {
        for(int i = 0; i < itemsSold.length; i++) {
            wages[i] = fixedWage + (itemsSold[i] * perItemWage);
            if(itemsSold[i] > computeBonusThreshold()) 
                wages[i] *= 1.1;
        }
    }
}
