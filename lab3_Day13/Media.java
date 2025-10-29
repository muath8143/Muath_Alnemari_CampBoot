package lab3_Day13;

public class Media {
    protected String title;
    protected String auteur;
    protected String ISBN;
    protected double price;
    public Media (String title,String auteur,String ISBN, double price ){
        this.title=title;
        this.auteur=auteur;
        this.ISBN=ISBN;
        this.price=price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getMediaType(){
        return "Media";
    }
    public String toString(){
        return "The title: "+getTitle()+" the auteur: "+getAuteur()+" the ISBN: "+getISBN()+" the price= "+getPrice();
    }
}
