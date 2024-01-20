//Everything works as intended but the classes have different names than in the examples
public class Textbook {
    public static void main(String[] args) {
        Book bio2015 = new Book("Bio", 49.75f, 2);
        Book bio2019 = new Book("Bio", 39.75f, 3);
        bio2015.checkSubstitutionCompatibility(bio2019);
    }
}

class Book extends BookTest {
    private int edition;

    public Book(String subject, double price, int edition) {
        super(subject, price);
        this.edition = edition;
    }

    public void displayBookInfo() {
        System.out.println(getSubject() + " - $" + getPrice() + " - Edition " + edition);
    }

    public boolean checkSubstitutionCompatibility(Book secondBook) {
        return getSubject().equals(secondBook.getSubject()) && edition >= secondBook.edition;
    }
}

class BookTest {
    private String subject;
    private double price;

    public BookTest(String subject, double price) {
        this.subject = subject;
        this.price = price;
    }

    public String getSubject() {
        return subject;
    }

    public double getPrice() {
        return price;
    }
}
