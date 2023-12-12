package Dillon2;
public class Phrase {
    String currentPhrase;
    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n) {
        int index = 0;
        int occ = 0;
        for(int i = 0; i < currentPhrase.length(); i++) {
            if((str.length() + i) <= (currentPhrase.length() - 1)) {
                String x = currentPhrase.substring(i, str.length() + i);
                if(x.equals(str)) {
                    index++;
                    occ = i;
                }
            }

            if(index == n) {
                return occ;
            }
        }
        return -1;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
		int i = findNthOccurrence( str,  n);
		if(i >= 1) {
			this.currentPhrase = currentPhrase.substring(0, i) + repl + currentPhrase.substring(i+str.length(), currentPhrase.length());

		}
		
	}

    public int findLastOccurrence(String str) {
		int occ = -1;
		
		for(int i = 0;i < currentPhrase.length(); i++) {
			int j = findNthOccurrence(str, i);
			if(j>0)	{
				occ = j;
			}
				
		}
		return occ;
	}

    public static void main(String[] args) {
		Phrase phrase1 = new Phrase("This is Dillon Dillon");
		
		int i = phrase1.findNthOccurrence("Dillon", 2);
		phrase1.replaceNthOccurrence("Dillon", 2, "Maltese");
		System.out.println(phrase1);
		Phrase phrase2 = new Phrase("I am testing this"); 
		phrase2.replaceNthOccurrence("testing", 1, "not really testing"); 
		System.out.println(phrase2);
		 
		
		
	
	}

}
