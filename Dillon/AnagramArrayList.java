package Dillon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        list.add(String.valueOf(num1));
        list.add(String.valueOf(num2));

        String str1 = list.get(0);
        String str2 = list.get(1);

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    static boolean areAnagrams(String str1, String str2) {
        // Check if lengths are different, if yes, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them using a simple sorting algorithm
        char[] charArray1 = sortCharArray(str1.toCharArray());
        char[] charArray2 = sortCharArray(str2.toCharArray());

        // Compare the sorted arrays
        return areArraysEqual(charArray1, charArray2);
    }
    static char[] sortCharArray(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static boolean areArraysEqual(char[] arr1, char[] arr2) {
        // Compare the sorted arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}