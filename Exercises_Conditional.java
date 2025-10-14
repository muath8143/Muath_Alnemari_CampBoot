import java.util.Scanner;
import java.util.Random;
public class Exercises_Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/* 1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" (tip:use if else)*/
        System.out.println("Enter your role ");
        String role = input.nextLine();
        if (role.equalsIgnoreCase("admin")){
            System.out.println("welcome admin");
        }
        else if (role.equalsIgnoreCase("superuser")){
            System.out.println("welcome superuser");
        }
        else if (role.equalsIgnoreCase("user")){
            System.out.println("welcome user");
        }
        else {
            System.out.println("invalid role");
        }
        System.out.println("----------------------------------------------------------------------");

/*2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87*/
        System.out.println("Enter number1");
        int number1 = input.nextInt();
        System.out.println("Enter number2");
        int number2 = input.nextInt();
        System.out.println("Enter number3");
        int number3 = input.nextInt();
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("the greatest number is " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("the greatest number is " + number2);
        } else {
            System.out.println("the greatest number is " + number3);
        }
        System.out.println("----------------------------------------------------------------------");

/*3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday*/
       Random generator = new Random();
       int day = generator.nextInt(7)+1;
        System.out.println("the generated number is " + day);
        switch (day){
            case 1:
             System.out.println("Sunday");
             break;
             case 2:
              System.out.println("Monday");
              break;
              case 3:
              System.out.println("Tuesday");
              break;
              case 4:
              System.out.println("Wednesday");
              break;
              case 5:
              System.out.println("Thursday");
              break;
              case 6:
              System.out.println("Friday");
              break;
              case 7:
              System.out.println("Saturday");
              break;

        }
        System.out.println("----------------------------------------------------------------------");

/*4. Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69 F:
0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B
*/
        System.out.println("Enter your numeric score:");
        int score = input.nextInt();
        if (score >=90 && score <=100){
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: A");
        }
        else if (score >=80 && score <=89){
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: B");
        }
        else if (score >=70 && score <=79){
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: C");
        }
        else if (score >=60 &&  score <=69){
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: D");
        }
        else if (score <=59 && score >=0){
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: F");
        }
        else {
            System.out.println("invalid numeric Score please try again:" );
        }
        System.out.println("----------------------------------------------------------------------");

/*5. Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult*/
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age <13){
            System.out.println("You are a Child");
        }
        else if (age >= 13 && age <= 19){
            System.out.println("You are a Teenager");
        }
        else {
            System.out.println("You are an Adult");
        }

    }
}
