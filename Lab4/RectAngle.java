package Lab4;
public class RectAngle extends Shape{
    private double height;
    private double width;

    public RectAngle(double height,double width){
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return (height+width)*2;
    }
}
