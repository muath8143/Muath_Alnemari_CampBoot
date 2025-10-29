package lab3_Day13;

public class Review {
    private String Username;
    private int rating;
    private String comment;

    public Review(String Username, int rating, String comment) {
        this.Username = Username;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
