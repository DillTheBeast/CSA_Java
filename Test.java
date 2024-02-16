public class Test {
    public static void main(String[] args) {
        boolean b1 = true && (17 % 3 == 1);
        boolean b2 = (true && false) || true;
        if(b1 == b2) {
            System.out.println("True");
        }
}

}