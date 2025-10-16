import java.util.Scanner;
import java.util.Random;
public class MyStart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* String FirstName = "Muath";
        int Id = 112; // This is id of student
        System.out.println("Enter your first name");
        FirstName = input.nextLine();
        double length = 154.6;
        System.out.println("Enter your length");
        length = input.nextDouble();
        float wight=80.7f;
        System.out.println("Enter your weight");
        wight = input.nextFloat();
        boolean gender = true;
        char favourite = 'm';
        System.out.println("Enter your favourite");
        favourite = input.next().charAt(3);
         These are type data in java we have learned how to concat*/
        // System.out.println("This is your data:\n id: " + Id+"\n"+ " Name: "+ FirstName +"\n"+ " length:"+ length +"\n"+ " weight:"+ wight+"\n" + " gender: "+ gender+"\n" + " favourite :"+ favourite);


       /* int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = (num1+num2);
        boolean numbers = num1==num2;
        System.out.println(numbers);
        boolean numbers2 = num1<num3;
        System.out.println(numbers2);
        boolean numbers3 = num5>num4;
        System.out.println(numbers3);
        boolean numbers4 = ((num2<num1) && (num2==num2));
        System.out.println(numbers4);
        boolean numbers5 = ((num5>num4) || (num5==num4));
        System.out.println(numbers5);*/

        /*String username = (" Muath Alnemari ");
        System.out.println(username.toLowerCase());
        System.out.println(username.trim());
        System.out.println(username.toUpperCase());
        System.out.println(username.replace("Muath", "Ahmad"));
        System.out.println(username.startsWith("mu"));
        System.out.println(username.endsWith("a"));
        System.out.println(username.contains("h"));
        System.out.println(username.getBytes());
        System.out.println(username.equals(" muath alnemari "));
        System.out.println(username);
        System.out.println(username.equalsIgnoreCase(" muath alnemari "));
        */
        //------------------------------------------------------------------------------------------------------------------------------
        //Day2

//Train with nawaf

      /*  String Unv1 = "Umm Alqura University";
        String Unv2 = "King Saud University";
        String Unv3 = "Al Yamamah University";
        String Unv4 = "Hail University";
        String Unv5 = "Taif University";

        int age= input.nextInt();
        Boolean dgree =  input.nextBoolean();
        double GPA = input.nextDouble();

        if (age>18 && (dgree ||  (GPA>2.0) )) {
            System.out.println("you are in "+ Unv1);
        };
        if (age>18 && (dgree ||  (GPA>2.5) )) {
            System.out.println("you are in " + Unv2);
        }
        if (age>18 && (dgree ||  (GPA>2.75) )) {
            System.out.println("you are in " + Unv3);
        }
        if (age>18 && (dgree ||  (GPA>3.0) )) {
            System.out.println("you are in " + Unv4);
        }
        if (age>18 && (dgree ||  (GPA>3.5) )) {
            System.out.println("you are in " + Unv5);
        }*/

//Train with nawaf
       /* int age = input.nextInt();
        double gpa =input.nextInt();
        System.out.println("----------welcom in inquiry about the driving test-------");
        System.out.println("Enter your age ");
        System.out.println("Enter your gpa ");
        if (age> 18  && gpa >2.0 ) {
            System.out.println("you are bass the driving license test");
        }
        else {
            System.out.println("You are fail in driving license test");

// Train from me !!!!
        }
        System.out.println("---------------------- Welcome to Tuwaiq academy ----------------------");
        System.out.println("Have you studied in a camp before");
        String answer = input.nextLine();
        Boolean join;
        if (answer.equals("yes")) {

        }
        int age ;
        */
//Train with nawaf
        /*
        System.out.println("--------------------------------------- Welcome in academy games ------------------");
        System.out.println("Enter your choice (+ , / , *)");
        String addition = "+";
        String division = "/";
        String multiplication = "*";
        String cahrChoice = input.nextLine();
        Random rand = new Random();
        int Random1 = rand.nextInt(100);
        int Random2 = rand.nextInt(100);
        double result=0;

        if (cahrChoice.equalsIgnoreCase(addition)) {
            System.out.print(Random1);
            System.out.print(addition);
            System.out.println(Random2);
            result=Random1 + Random2;
        }

        else if (cahrChoice.equalsIgnoreCase(multiplication)) {
            System.out.print(Random1);
            System.out.print(multiplication);
            System.out.println(Random2);
            result=Random1 * Random2;

        } else if (cahrChoice.equalsIgnoreCase(division)) {
            System.out.print(Random1);
            System.out.print(division);
            System.out.println(Random2);
            result = Random1 / Random2;
        }
        else {
            System.out.println("wrong choice");
        }
        System.out.println("enter your guess number");
        double choice = input.nextInt();

        if (choice == result) {
            System.out.println("answer is correct");
        }
        else {
            System.out.println("answer is not correct");
        }
      */
        /*
        System.out.println("------------------------------Welcome in city guide------------------------------");
        System.out.println("please enter the city you would like to know about");
        System.out.println("Menu of cities");
        System.out.println("Riyadh");
        System.out.println("Jeddah");
        System.out.println("Hail");
        System.out.println("Taif");
        System.out.println("Abha");
        String city = input.nextLine();

        switch (city){

            case "Riyadh":
            System.out.println("Riyadh is the capital and largest city of Saudi Arabia.\\n It is also the capital of the Riyadh Province and the centre of the Riyadh Governorate. \\nLocated on the eastern bank of Wadi Hanifa, the current form of the metropolis largely emerged in the 1950s as an offshoot \\nof the 18th century walled town following the dismantling of its defensive fortifications");
            break;

            case "Jeddah":
            System.out.println("Jeddah is a governorate and the largest city in Mecca Province,\\n Saudi Arabia, and the country's second largest city after Riyadh,\\n located along the Red Sea coast in the Hejaz region. \\nJeddah is the commercial center of the country");
            break;
            case "Hail":
            System.out.println("");
            break;

            case "Taif":
            System.out.println("");
            break;
            case "Abha":
                System.out.println("");
            default:
            System.out.println("Sorry the " + city + " is not present in our system");
        }
        */
       /* System.out.println("--------------------Welcome in challenges Tuwaiq academy---------------------------------");
        System.out.println("enter your number");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("thr number is even");
        }
        else {
            System.out.println("thr number is odd");
           */
// here some challenges from 2 to 6
        //----------------------------------------------------------------------------------------------------------------------------------
        //Day4
       /* System.out.println("----------------------------------------Welcome in tasks system----------------------------------------");
        int Id = 5;
        int count = 5;

       do {
           System.out.println("Enter your id:");
           Id = input.nextInt();
           if (Id == 100) {
               System.out.println("You have spesichal ");
           }


           switch (Id) {
               case 1:
                   System.out.println("you have 3 task");
                   count = 0;
                   break;

               case 2:
                   System.out.println("you have 2 task");
                   count = 0;
                   break;

               case 3:
                   System.out.println("you dont have any task");
                   count = 0;
                   break;

               default:
                   System.out.println("you id is wrong");
                   count = count + 1;
           }
       } while (count>=5 && count <10);

       if (count == 10) {
           System.out.println("you try 5 times please again later");
       }
*/
    /*
     */
        /*
        int score = 0;
        String sto ;
        boolean flag = true;

        do {

            System.out.println("Enter your number ");
            score = (score + input.nextInt());
            sto=input.nextLine();

            if ((sto.equalsIgnoreCase("stop"))){
                flag = false;
                break;
            }

        } while (flag);

         */
        int score = 0;
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        for (int i=1 ;i<=9;i++) {
            score = i * number;
            System.out.println(score);
        }
    }
}



