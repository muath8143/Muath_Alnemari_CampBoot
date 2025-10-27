package Exercise_day12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//test class Shape
        Shape sh1=new Shape();
        Shape sh2 =new Shape("red",true);
        System.out.println(sh2.getColor());
        System.out.println(sh2.isFilled());
        System.out.println("Enter your favorite color");
        String color = input.nextLine();
        sh2.setColor(color);
        System.out.println(sh2.getColor());
        sh2.setFilled(false);
        System.out.println("this is default constructor of class Shape: "+sh1.toString());
        System.out.println("this is second constructor: "+sh2.toString());
        //----------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------");
        // test class
        Circle ci1=new Circle();
        System.out.println("this is default constructor of class Circle: "+ci1.toString());
        Circle ci2 =new Circle(3.5);
        System.out.println("the radius of construtor = "+ci2.getRadius());
        double radius =5;
        ci2.setRadius(radius);
        System.out.println("the radius= "+ci2.getRadius());
        System.out.println("the area of circle = "+ci2.getArea());
        System.out.println("the perimeter of circle = "+ci2.getPerimeter());
        System.out.println(ci2.toString());
        Circle ci3 =new Circle(radius,color,false);
        System.out.println(ci3.toString());
        //---------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------");
        Rectangle re1=new Rectangle();
        System.out.println("this is default constructor of class Rectangle: "+re1.toString());
        System.out.println("enter width: ");
        double width =input.nextDouble();
        System.out.println("enter length: ");
        double length =input.nextDouble();
        Rectangle re2=new Rectangle(width,length);
        System.out.println("the length = "+re2.getLength());
        System.out.println("the width = "+re2.getWidth());
        System.out.println("the area of rectangle = "+re2.getArea());
        System.out.println("the perimeter of rectangle = "+re2.getPerimeter());
        re2.setLength(5.5);
        System.out.println("the length= "+re2.getLength());
        re2.setWidth(7);
        System.out.println("the width= "+re2.getWidth());

        Rectangle re3=new Rectangle(7.2,5.5,"blue",false);
        System.out.println(re3.toString());
        //---------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------");
        Square sq1=new Square();
        System.out.println("this is default constructor of class Square: "+sq1.toString());
        System.out.println("enter a side: ");
        double side = input.nextDouble();
        Square sq2 =new Square(side);
        System.out.println("this is side: "+sq2.getSide());
        sq2.setSide(side);
        System.out.println("this is side: "+sq2.getSide());
        System.out.println("this is area= "+ sq2.getArea());
        System.out.println("this is perimeter= "+sq2.getPerimeter());

        Square sq3 =new Square(side,"orange",false);
        System.out.println(sq3.toString());

    }
}