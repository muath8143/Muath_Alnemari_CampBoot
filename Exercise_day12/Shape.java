package Exercise_day12;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape (){
        color="green";
        filled=true;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public String toString(){
        if (filled){
            return "A shape with color of "+ color+" and filled";
        }
        else{
            return "A shape with color of "+ color+" and not filled";
        }

    }
}
