import java.util.ArrayList;
import java.util.List;

public class thingy {
    public static void main(String[] args) {
        int[][] start = {{1, 2, 3}, {4, 5, 6, 9}, {7, 8, 9}};
        boolean ischeck = isDiverse(start);
        System.out.println(ischeck);
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int num : arr) sum += num;
        return sum;
    }

    public static int[] arraySum(int[][] arr) {
        int sums[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            sums[i] = arraySum(arr[i]);
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] end = arraySum(arr2D);
        int curr = 0;
        for(int x = 0; x < end.length; x++) {
            curr = end[x];
            for(int y = 0; y < end.length; y++) {
                if(x != y && curr == end[y]) {
                    return false;
                }
            }
        }
        return true;
    }
}