import java.util.ArrayList;
import java.util.Arrays;
public class AnagramArrayList {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>();
        String num1;
        String num2;
        numbers.add("123432");
        numbers.add("234123");

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