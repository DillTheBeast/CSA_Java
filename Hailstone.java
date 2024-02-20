public class Hailstone {
    public static int hailstoneLength(int n) {
        int length = 1;
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            length++;
        }
        return length;
    }
    public static boolean isLongSeq(int n) {
        return hailstoneLength(n) > n;
    }

    public static double propLong(int n) {
        int longSequences = 0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i))
                longSequences++;
        }
        return (double) longSequences / n;
    }
}
