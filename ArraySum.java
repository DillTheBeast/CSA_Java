public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int p = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            p += arr[i];
        }
        System.out.println(p);
    }
}
