package lab3_Day13;

import java.util.ArrayList;

public class Music extends Media{
    protected String artist;

    public Music(String title, String auteur, String ISBN, double price,String artist) {
        super(title, auteur, ISBN, price);
        this.artist=artist;
    }

    public void listen (User user){
        user.addToPurchaseMediaList(this);
        user.removeFromCart(this);
    }
    public ArrayList<Music> generatePlaylist(ArrayList<Music> orignal){
    ArrayList <Music> playList=new ArrayList<>();
    for (Music m:orignal){
        if (m.artist.equalsIgnoreCase(this.artist)){
            playList.add(m);
        }
    }
    return playList;
    }


    @Override
    public String getMediaType() {
        if (getPrice()>=10){
            return "PREMIUM";
        }
        else
            return "Music";
    }

    @Override
    public String toString() {
        return super.toString()+" the artist is: "+artist;
    }
}
