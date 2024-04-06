public class InClass {
    public static void main(String[] args) {
        int[][] arr = { {10,39,8},{3},{35,87},{22},{34} };
        for(int[] num : arr) {
            for(int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
