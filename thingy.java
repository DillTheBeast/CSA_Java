public class thingy {
    public static void main(String[] args) {
        Thing1 p = new Thing1(0);
        int y = p.thing2();
        System.out.println(y);
        
    }
    public static int method(int x, int y) {
        return x;
    }
    public static double method(double x, double y) {
        return x;
    }


}

class Thing1 {
    int x;

    public Thing1(int x1) {
        x = x1;
    }

    public int thing2() {
        return x;
    }
}
