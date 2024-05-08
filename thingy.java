import java.util.ArrayList;
import java.util.List;

public class thingy {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(mystery(0, arr.length - 1, 7, arr));

    }
    public static int mystery(int low, int high, int num, int[] arr)
{
 int mid = (low + high) / 2;
 if (low > high)
 {
 return low;
 }
 else if (arr[mid] < num)
 {
 return mystery(mid + 1, high, num, arr);
 }
 else if (arr[mid] > num)
 {
 return mystery(low, mid - 1, num, arr);
 }
 else // arr[mid] == num
 {
 return mid;
 }
}
}
