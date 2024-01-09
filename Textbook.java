public class Textbook {
    public static void main(String[] args) {
        Book bio2015 = new Book("Bio", 49.75f, 2);
        Book bio2019 = new Book("Bio", 39.75f, 3);
    }
}

class Book {
    public String subject;
    public float price;
    public int edition;

    public Book(String s, float p, int e) {
        subject = s;
        price = p;
        edition = e;
    }

    public void getBookInfo() {
        System.out.println(subject + "-" + price + "-" + edition);
    }

    public boolean canSubsituteFor(Book secondBook) {
        if (subject.equals(secondBook.subject) && edition > secondBook.edition) {
            return true;
        }
        return false;
    }
}
