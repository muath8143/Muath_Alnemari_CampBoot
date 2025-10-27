package Exercise_day12;

public class Square extends Rectangle{
    public Square (){
        super(1.0,1.0);
    }
    public Square (double side){
        super(side,side);
    }
    public Square(double side , String color , boolean filled){
       super(side,side,color,filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        length=side;
        width=side;
    }

    public String toString (){
        return "A Square with side= "+width+" which is a subclass of "+super.toString();
    }
}
