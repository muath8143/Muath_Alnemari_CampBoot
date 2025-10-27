package Exercise_day12;

public class Circle extends Shape {
    protected double radius;

    public Circle(){
        radius=1.0;
    }
    public Circle (double radius){
        this.radius=radius;
    }
    public Circle (double radius ,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (radius*radius)*3.14;
    }
    public double getPerimeter(){
        return (radius*3.14)*2;
    }
    public String toString (){
        return "A Circle with radius= "+radius+" which is a subclass of "+super.toString();
    }
}
