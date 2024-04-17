public class idk {
    public static void main(String[] args) {
        Artwork starry = new Artwork("The Starry Night", 1889, "Van Gogh");
        starry.printInfo();
    }
}

class Artifact {
    private String title;
    private int year;
    public Artifact(String t, int y) {
        title = t;
        year = y;
    }

    public void printInfo()
    {
        System.out.print(title + " (" + year + ")");
    }
}

class Artwork extends Artifact {
    private String artist;
    public Artwork(String t, int y, String a) {
        super(t, y);
        artist = a;
    }

    public void printInfo() {
        System.out.print(title + " (" + year + ") by " + artist);
    }
}

