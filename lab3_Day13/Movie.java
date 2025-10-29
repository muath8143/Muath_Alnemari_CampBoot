package lab3_Day13;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    protected int duration; // in minutes

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration=duration;
    }

    public void watch (User user){
        user.addToPurchaseMediaList(this);
        user.removeFromCart(this);
    }
    public ArrayList<Movie> reco (ArrayList<Movie>movieCatalog){
      ArrayList<Movie> newmMovies=new ArrayList<>();
       for (Movie m:movieCatalog){
           if (m.auteur.equalsIgnoreCase(this.auteur)){
               newmMovies.add(m);
           }
       }
       return newmMovies;
    }


    @Override
    public String getMediaType() {
       if(duration>=120){
           return "Long movie";
       }
       else
           return "Movie";
    }

    @Override
    public String toString() {
        return super.toString()+" the duration:  "+duration+" minutes";
    }
}
