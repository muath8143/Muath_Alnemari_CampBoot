package Exercise_Day14;
public class Main {
    public static void main(String[] args) {
        //test Product
        System.out.println("------------------------------Test Q1 Product------------------------------");
        Book b1 = new Book("firstbook", 100,"Muath");
        System.out.println("the author is: "+b1.getAuthor());
        System.out.println("the price before discount: "+b1.getPrice());
        System.out.println("the price after discount: "+b1.getDiscount());
        Movie m1 =new Movie("new movie",100, "Ahmad");
        System.out.println("the director is: "+m1.getDirector());
        System.out.println("the price before discount: "+m1.getPrice());
        System.out.println("the price after discount: "+m1.getDiscount());
//----------------------------------------------------------------------------------------
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("------------------------------Test Q2 Movable------------------------------");

        MovablePoint mo1=new MovablePoint(10,20,5,15);
        System.out.println("Y before move up: "+mo1.getY());
        mo1.moveUp();
        System.out.println("Y after move up: "+mo1.getY());
        System.out.println(" ");
        System.out.println("Y before move down: "+mo1.getY());
        mo1.setySpeed(20);
        mo1.moveDown();
        System.out.println("Y after move down: "+mo1.getY());
        System.out.println(" ");
        System.out.println("X before move right: "+mo1.getX());
        mo1.moveRight();
        System.out.println("X before move right: "+mo1.getX());

        System.out.println(" ");
        System.out.println("X before move left: "+mo1.getX());
        mo1.setxSpeed(10);
        mo1.moveLeft();
        System.out.println("X after move left: "+mo1.getX());

    }
}