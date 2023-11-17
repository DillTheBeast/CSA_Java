package Submit2;
import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] array1 = {6, 1, 4, 2, 9};
        int[] array2 = {3, 10, 5, 8, 7};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Function to merge two arrays
    private static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        // Copy elements of array1 to mergedArray
        System.arraycopy(array1, 0, mergedArray, 0, length1);

        // Copy elements of array2 to mergedArray
        System.arraycopy(array2, 0, mergedArray, length1, length2);

        return mergedArray;
    }
}
