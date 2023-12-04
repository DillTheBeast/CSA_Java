package Dillon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramArraysSort {
        //Way1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        numbers.add(String.valueOf(num1));
        numbers.add(String.valueOf(num2));

        for(int i = 0; i < numbers.size(); i+=2) {
            num1 = numbers.get(i);
            num2 = numbers.get(i+1);
            if (areAnagrams(num1, num2)) {
                System.out.println(num1 + " and " + num2 + " are anagrams.");
            } else {
                System.out.println(num1 + " and " + num2 + " are not anagrams.");
            }
        }
    }

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
