package Exercise_Day14;

public class Movie extends Product{
    protected String director;
    public Movie(){
        director="";
    }
    public Movie(String name, double price ,String director){
        super(name, price);
        this.director=director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return price-(price*0.10);//10%
    }
}
