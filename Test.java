public class Test {
    public static void main(String[] args) {
        int[] s = {3, 4};
        int b = 4;
        test(s, b);
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println(b);

    }
    public static void test(int[] a, int y) {
        if (a.length > 1) {
            a[1] = a[1] * 2;
        }
        y = y * 2;
    }
}