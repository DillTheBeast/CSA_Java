public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(0, 1, 10));
    }

    public static int fib(int f, int s, int t) {
        if(t == 1) return f;
        else return fib(s, f+s, t-1);
    }
}
