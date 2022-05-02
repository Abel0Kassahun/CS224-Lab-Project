public class Review {
    private final String reviewID;
    private String username;
    private byte userRating;
    private String userReview;

    public Review(String reviewID, String username, byte userRating, String userReview) {
        this.reviewID = reviewID;
        this.username = username;
        this.userRating = userRating;
        this.userReview = userReview;
    }

    // since reviewID is final variable it doesn't have a set method
    public String getReviewID() {
        return this.reviewID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUserRating(byte userRating) {
        this.userRating = userRating;
    }

    public byte getUserRating() {
        return this.userRating;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }

    public String getUserReview() {
        return this.userReview;
    }
}
