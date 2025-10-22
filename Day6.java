import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Day6 {

   /* public static int welcome (String name){
        Random rand = new Random();
        System.out.println("Welcome to day 6 MR."+name);
        int age = rand.nextInt(60)+1;
        return age;
    }*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /*    int [] cars = new int[5];
        cars[0] = 1;
        cars[1] = 7;
        cars[2] = 6;
        cars[3] = 8;
        cars[4] = 10;
        for (int i = cars.length-1; i >0; i--) {
            if (cars[i] % 2 == 0){
                System.out.println("The number " + cars[i]+" is even  ");
                continue;
            }
            else{
                System.out.println("The number "+ cars[i] +" is odd");
            }
        }*/
        // int big =cars[0];
      //   for (int i =0; i<cars.length; i++){
      //       System.out.println(cars[i]);

      //   }
      //  String names []={"Mojahed", "Muath "};
      //   for (int i =0; i<names.length; i++){
     //      System.out.println(names[i]);
       //  }

      /*  String names[]={"soha","muath", "sondos","Sami","ahmad"};
        int [] cars = new int[5];
        cars[0] = 1;
        cars[1] = 7;
        cars[2] = 6;
        cars[3] = 8;
        cars[4] = 10;

       // for (int i=0;i< names.length;i++) {

         //   names[i]=names[i].toLowerCase();

           //  if (names[i].startsWith("s")){
             //    System.out.println(names[i]);
             //}
           // if (names[i].charAt(0)=='s'){
            //    System.out.println(names[i]);
            //}
        for(String n :names) {
            n = n.toLowerCase();
            if (n.startsWith("s")) {
                System.out.println(n);
            }
        }
            for (int c:cars){
                if (c%2==0){
                    System.out.println("the number "+c+" is even");
                    continue;
                }
                else{
                    System.out.println("the number "+c+" is odd");
                }
            }*/

       /*ArrayList carsList = new ArrayList();
        carsList.add("BMW");
        carsList.add("Ford");
        carsList.add("Camry");
        System.out.println(carsList);
        System.out.println(carsList.size());
        carsList.remove(1);
        System.out.println(carsList);


        ArrayList <String >color = new ArrayList();
        color.add("red");
        color.add("black");
        color.add("green");
        color.add("blue");

      for (String str : color) {
          if (str.length()<=3){
              System.out.println(str+" is short");
          }
          else {
              System.out.println(str+" is long");
              System.out.println();
          }
      }
      */

        // project with nawaf--------------------------------------------
        String name;
        int age;
        int grade ;
        String con;
        ArrayList <String> names  =new ArrayList<>();
        ArrayList <Integer> ages =new ArrayList<>();
        ArrayList <Integer> grades = new ArrayList<>();
        do {
            System.out.println("Enter the student name:");
            name= input.nextLine();
            names .add(name);
            System.out.println("enter age of student ");
            age = input.nextInt();
            ages.add(age);
            System.out.println("Enter grade of student");
            grade = input.nextInt();
            grades.add(grade);
            input.nextLine();
            System.out.println("Do you want add another student? : y/n");
            con= input.nextLine();
            if (con.equalsIgnoreCase("n")){
                break;
            }
        }while (con.equalsIgnoreCase("y"));

        System.out.println("To display names of student enter 1:\n To display ages of student enter 2:\n To display grades of student enter 3:\n To exit enter 4 ");
        int enter =input.nextInt();
        input.nextLine();
        int cont=0;
        do {
            System.out.println("To display names of student enter 1:\n To display ages of student enter 2:\n To display grades of student enter 3:\n To exit enter 4 ");
            switch (enter){
                case 1:
                    for(String n:names ){
                        System.out.println(n);
                        break;
                    }
                case 2:
                    for (int a: ages){
                        System.out.println(a);
                        break;
                    }
                case 3:
                    for (int g:grades ){
                        System.out.println(g);
                        break;
                    }

                    System.out.println("Enter 0 to exit: ");
                    cont = input.nextInt();
            }
        }while (cont!=0);




        }
        }



