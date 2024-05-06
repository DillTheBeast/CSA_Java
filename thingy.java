import java.util.ArrayList;
import java.util.List;

public class thingy {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        students.add("Alex");
        students.add("Bob");
        students.add("Charlles");
        for(int k = 0; k < students.size(); k++) {
            System.out.println(students.set(k, "Alex") + " ");
        }

        System.out.println();

        for(String str : students) {
            System.out.println(str + " ");
        }
    }
}