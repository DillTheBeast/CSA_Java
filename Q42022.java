import java.util.ArrayList;

public class Q42022 {
    public static void main(String[] args) {

        Review[] reviews = new Review[10];
        for(int i = 0; i < reviews.length; i++) {
            reviews[i] = new Review(i, "Comment " + i);
        }
        ReviewAnalysis analysis = new ReviewAnalysis(reviews);
        System.out.println(analysis.getAverageRating());
        ArrayList<String> comments = analysis.collectComments();
        for(String comment : comments) {
            System.out.println(comment);
        }
    }
}

class ReviewAnalysis {
    private Review allreviews[];

    public ReviewAnalysis(Review[] reviews) {
        allreviews = reviews;
    }

    public double getAverageRating() {
        double total = 0;
        for(int i = 0; i < allreviews.length; i++) {
            total += allreviews[i].getRating();
        }
        return total / allreviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<String>();
        for(int i = 0; i < allreviews.length; i++) {
            comments.add(allreviews[i].getComment());
        }
        return comments;
        
    }
}

class Review {
    private int rating;
    private String comment;

    public Review(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
