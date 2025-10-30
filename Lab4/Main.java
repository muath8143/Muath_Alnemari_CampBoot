package Lab4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Choose the one you want from the list below: \n1.Circle \n2.Rectangle \n3.Triangle");
        int choose= input.nextInt();
        switch (choose){

            case 1:
                System.out.println("enter a radius: ");
                Circle c1=new Circle(input.nextDouble());
                System.out.printf("the area of circle have radius= "+c1.getRadius()+", area= %.2f ",+c1.calculateArea());
                System.out.println();
                System.out.printf("the circumference of circle have radius= "+c1.getRadius()+", circumference= %.2f ",+c1.calculateCircumference());
                break;

            case 2:
                System.out.println("Enter a height: ");
                double height=input.nextDouble();
                System.out.println("Enter a width: ");
                double width = input.nextDouble();
                RectAngle r1=new RectAngle(height,width);
                System.out.printf("the area of rectangle have height= "+r1.getHeight()+", and width = "+ r1.getWidth() +", area= %.2f ",+r1.calculateArea());
                System.out.println();
                System.out.printf("the circumference of rectangle have height= "+r1.getHeight()+", and width = "+ r1.getWidth() +", circumference= %.2f ",+r1.calculateCircumference());
                break;

            case 3:
                System.out.println("Enter a height: ");
                double height1= input.nextDouble();
                System.out.println("Enter a base: ");
                double base= input.nextDouble();
                Triangle tr1=new Triangle(height1,base);
                System.out.printf("the area of triangle have height= "+tr1.getHeight()+", and base = "+ tr1.getBase() +", area= %.2f ",+tr1.calculateArea());
                System.out.println();
                System.out.printf("the circumference of equilateral triangle have base = "+ tr1.getBase() +", circumference= %.2f ",+tr1.calculateCircumference());
                break;
        }
    }
}