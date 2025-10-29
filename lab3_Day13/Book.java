package lab3_Day13;

import java.util.ArrayList;

public class Book extends Media{
    protected int stock;
    protected ArrayList<Review> reviews=new ArrayList<>();

    public Book(String title, String auteur, String ISBN, double price ,int stock) {
        super(title, auteur, ISBN, price);
        this.stock=stock;
    }

    public void Addreview(Review r){
        reviews.add(r);  // add review in main at least 3 reviews
    }
    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Review t : reviews) {
            sum += t.getRating();
        }
        return sum/reviews.size();
    }

    public void purchase (User user){
        if (stock>0){
            user.addToPurchaseMediaList(this);
            user.removeFromCart(this);
            stock--;
        }

    }
    public boolean isBestSeller(){
        double avg = getAverageRating();
        if(avg>=4.5){
            return true;
        }
        else {
            return false;
        }
    }
    public String restock (int qa){
        stock=stock +qa;
        return "the new stock= "+stock;
    }


    @Override
    public String getMediaType() {
        if (getAverageRating()>=4.5){
            return "Bestselling book";
        }
        else
            return "Book";
    }
    public String toString (){
        return super.toString()+ " the stock of book= "+stock+" the reviews of book= "+reviews;
    }
}
