package Lab4;
public class Circle extends Shape{
    private double radius ;

    public Circle (double radius){
    this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (radius*radius)*Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return (radius*2)*Math.PI;
    }
}
