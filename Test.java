public class Test {
    public static void main(String[] args) {
        Integer val = 10;
        int result1 = timesTwo(val);
        Integer result2 = result1;
        System.out.print(result2);

    }
    public static int timesTwo (int n)
       {
return n * 2; }

}
class WindTurbine
       {
            private double efficiencyRating;
            public WindTurbine()
            {
                efficiencyRating = 0.0;
            }
            public WindTurbine(double e)
            {
                efficiencyRating = e;
            }
}