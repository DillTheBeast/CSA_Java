public class Practice {
    public static void main(String[] args) {
        String[] str = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "battling"};
        for(String word : str) {
            String ing = word.substring(word.length() - 3, word.length());
            if(ing.equals("ing")) {
                System.out.println(word);
            }
        }
    }
}
