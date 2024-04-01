import java.util.ArrayList;

public class things {
    public static void main(String[] args) {
        ArrayList<Double> conditionRating = new ArrayList<Double>();
        conditionRating.add(9.84);
        conditionRating.add(8.93);
        conditionRating.add(7.65);
        conditionRating.add(6.24);
        conditionRating.remove(2);
        conditionRating.set(2, 7.63);
        System.out.println(conditionRating);

    }
}
