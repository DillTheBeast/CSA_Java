import java.util.ArrayList;

public class PalindromeArrayList {
    public static void main(String[] args) {
        ArrayList<String> Words = new ArrayList<String>();
        String fullHolder;
        String backHolder;
        Words.add("1Racecar1");
        Words.add("tacocat");
        Words.add("this");
        Words.add("That");
        Words.add("TesTINg");
        for(int i = 0; i < Words.size(); i++) {
            backHolder = "";
            fullHolder = Words.get(i);
            for(int j = 0; j < fullHolder.length(); j++) {
                backHolder += fullHolder.charAt(fullHolder.length() - 1 - j);
            }
            if(backHolder.toLowerCase().equals(fullHolder.toLowerCase())) {
                Words.set(i, fullHolder + " is a palindrome");
            } else {
                Words.set(i, fullHolder + " is not a palindrome");
            }
        }
        System.out.println(Words);
    }
}
