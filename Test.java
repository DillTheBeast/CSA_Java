public class Test {
    public static void main(String[] args) {
        System.out.println(reverseString("Test"));
    }
    public static String reverseString(String str) {
        String result = "";
        for (int s = str.length() - 1; s >= 0; s--) {
            result += str.charAt(s);
        }
        return result;
    }

    public static void palindromeChecker(String str) {
        String newStr = str.toLowerCase();
        newStr = removeSpaces(newStr);
        String reversedStr = reverseString(newStr);
        if (reversedStr.equals(newStr)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

}
