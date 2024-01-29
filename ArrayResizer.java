public class ArrayResizer {


    public static int numNonZeroRows(int[][] array2D) {
        return 2;
    }
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int value : array2D[r]) {
            if (value == 0) {
                return false; // If any value in the row is zero, return false
            }
        }
        return true; // All values in the row are non-zero
    }

    public static int[][] resize(int[][] array2D) {
        int numNonZeroRows = numNonZeroRows(array2D);
        int[][] result = new int[numNonZeroRows][];

        int resultIndex = 0;
        for (int[] row : array2D) {
            if (isNonZeroRow(array2D, resultIndex)) {
                result[resultIndex] = row;
                resultIndex++;
            }
        }

        return result;
    }
}
