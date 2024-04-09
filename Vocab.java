public class Vocab
{
private String[] theVocab = {"a, b, c, d, e"};
public boolean findWord(String str)
{
    for(String word : theVocab) {
        if (word.equals(str)) {
            return true;
        }
    }
    return false;
}

public int countNotInVocab(String[] wordArray)
{
    int total = 0;
    for(String word : wordArray) {
        if (!findWord(word)) {
            total += 1;
        }
    }
    return total;
}

public String[] notInVocab(String[] wordArray)
{
    String[] notFound = new String[countNotInVocab(wordArray)];
    int count = 0;
    for(String word : wordArray) {
        if (!findWord(word)) {
            notFound[count] = word;
        }
    }
    return notFound;

}   
}