public class StringFunctions {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "World";
        //Takes the first character of the string
        System.out.println(s.charAt(0));

        //Adds whatever is inside the parentheses to the starting string
        System.out.println(s.concat("! My name is Dillon"));

        //Returns true if the String inside the parentheses is in the starting String
        System.out.println(s.contains(s1));

        //Returns true if the String inside the parentheses is the end of the starting String
         System.out.println(s.endsWith(s1));

        //Finds out where the character inside the parentheses is in the String
        System.out.println(s.indexOf("W"));

        //Returns true if the String is empty
        System.out.println(s.isEmpty());

        //Replaces first char with second char
        System.out.println(s.replace("o", "s"));

        //Prints all the characters in between the 2 indexes
        System.out.println(s.substring(2, 5));

        //Turns the String to all lowercases
        System.out.println(s.toLowerCase());

        //Turns the String to all uppercase
        System.out.println(s.toUpperCase());

        //Prints the total number of characters in the String
        System.out.println(s.length());

        //Splits the String into what comes before the character inside the parentheses and what comes after
        String[] s2 = s.split("e");
        for(int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
    }
}
