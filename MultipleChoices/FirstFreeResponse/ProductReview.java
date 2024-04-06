import java.util.ArrayList;

public class ProductReview {
    private String name;
    private String review;

    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }
}

class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        if (!productList.contains(prodReview.getName())) {
            productList.add(prodReview.getName());
        }
    }

    public int getNumGoodReviews(String prodName) {
        int count = 0;
        for (ProductReview review : reviewList) {
            if (review.getName().equals(prodName) && review.getReview().equals("best")) {
                count++;
            }
        }
        return count;
    }
}