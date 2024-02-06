public class HiddenWord {
    private String hiddenWord;

    // Constructor
    public HiddenWord(String word) {
        this.hiddenWord = word;
    }

    // Method to get the hint for a given guess
    public String getHint(String guess) {
        StringBuilder hint = new StringBuilder();

        for (int i = 0; i < hiddenWord.length(); i++) {
            char guessChar = guess.charAt(i);
            char hiddenChar = hiddenWord.charAt(i);

            if (guessChar == hiddenChar) {
                // Matching letter in the same position
                hint.append(guessChar);
            } else if (hiddenWord.indexOf(guessChar) != -1) {
                // Matching letter, but in a different position
                hint.append("+");
            } else {
                // Letter not in the hidden word
                hint.append("*");
            }
        }

        return hint.toString();
    }

    public static void main(String[] args) {
        // Example usage
        HiddenWord puzzle = new HiddenWord("HARPS");

        System.out.println(puzzle.getHint("AAAAA"));  // Output: "+A+++"
        System.out.println(puzzle.getHint("HELLO"));  // Output: "H****"
        System.out.println(puzzle.getHint("HEART"));  // Output: "H*++*"
        System.out.println(puzzle.getHint("HARMS"));  // Output: "HAR*S"
        System.out.println(puzzle.getHint("HARPS"));  // Output: "HARPS"
    }
}
