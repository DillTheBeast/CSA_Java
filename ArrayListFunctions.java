import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListFunctions {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("This");
        list2.add("THis2");
        list.add("Button");
        list.get(0);
        list.set(0, "Button2");
        if(list.contains("Button")) {
            System.out.println("yes");
        }
        list.add("test");
        list.add("test2");
        list.addAll(list2);
        list.remove("Button2");
        System.out.println(list);
        list.clear();
    }
}
