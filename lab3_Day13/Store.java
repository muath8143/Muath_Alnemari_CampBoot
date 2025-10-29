package lab3_Day13;

import java.util.ArrayList;

public class Store {
    private ArrayList<User>user=new ArrayList<>();
    private ArrayList<Media>media=new ArrayList<>();


    public void adduser(User use){
        user.add(use);
    }
    public ArrayList<User>  displayUsers(){
        return user;
    }


    public void addMedia(Media media){
        this.media.add(media);
    }
    public ArrayList<Media> displayMedia(){
        return media;
    }
    public Book searchBook(String title ){
        for(Media m :media){
            if(m instanceof Book){
                Book b =(Book) m;
                if(m.getTitle().equalsIgnoreCase(title)){
                    return b;
                }
            }
        }
        return null;
    }


}
