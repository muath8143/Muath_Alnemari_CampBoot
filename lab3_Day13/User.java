package lab3_Day13;

import java.util.ArrayList;

public class User {
    private String Username;
    private String email;
    private ArrayList<Media>purchaseMediaList=new ArrayList<>();
    private ArrayList<Media> shopingCart=new ArrayList<>();

    public User(String username, String email) {
        Username = username;
        this.email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public ArrayList<Media> getShopingCart() {
        return shopingCart;
    }


    public void Addtocart(Media media){
        shopingCart.add(media);
     }
     public void checkOut (){
        purchaseMediaList.addAll(shopingCart);
        shopingCart.clear();
     }
     public void removeFromCart(Media media){
        shopingCart.remove(media);
     }
     public void addToPurchaseMediaList (Media media){
        purchaseMediaList.add(media);
     }
    @Override
    public String toString() {
        return "username= "+Username +" email= "+email;
    }

}
