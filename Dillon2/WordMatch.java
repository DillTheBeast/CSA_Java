package Dillon2;
public class WordMatch {
    private String secret;
    public WordMatch(String word)
    {
        secret = word;
    }

    public int scoreGuess(String guess) { 
        int score = 0;
        int index;
        for(int i = 0; i < secret.length(); i++) {
            index = 0;
            if(secret.charAt(i) == guess.charAt(0)) {
                for(int j = 0; j < guess.length(); j++) {
                    if(i + j < secret.length() && secret.charAt(i + j) == guess.charAt(j)) {
                        index++;
                    }
                }
                if(index == guess.length()) {
                    score++;
                }
            }
        }
        return score * guess.length() * guess.length();
    }
    
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 < score2) { return guess2; }
        else { return guess1; }
    }

    public static void main(String[] args) {
        WordMatch match = new WordMatch("concatenation");
        System.out.println(match.scoreGuess("ten"));
        System.out.println(match.scoreGuess("nation"));
        System.out.println(match.findBetterGuess("ten", "nation"));
    }
}