import java.util.Scanner;
import java.lang.StringBuilder;
public class Exercise_Loop {
    public static void main(String[] args) {

/*1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number.1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number.*/
       for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

/*2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT*/
        Scanner input = new Scanner(System.in);
        String text = "";
        String again = "yes";
        boolean flag = true;
        do {
            System.out.println("Enter your text what to you want revers");
            text = input.nextLine();
            StringBuilder newtext = new StringBuilder(text);
            System.out.println(newtext.reverse());
            System.out.println("Do you want write another text yes/no ?");
            again = input.nextLine();
            if (again.equalsIgnoreCase("yes")) {
                flag = true;
            } else if (again.equalsIgnoreCase("no")) {
                flag = false;
            } else {
                System.out.println("Wrong input please write yes or no");
            }
        } while (flag);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

/*3.Write a program to find the factorial value of any number entered through the keyboard. */
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        int factorial = 1;

        if (number > 0) {
            do {
                factorial = factorial * number;
                number--;
            } while (number > 1);
            System.out.println("Factorial of is " + factorial);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");


/*4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java built-in method)*/
        int result=1;
        System.out.println("write the base number:  ");
        int number1 = input.nextInt();
        System.out.println("Enter the power of number ");
        int power = input.nextInt();

        for (int i=1; i<=power; i++) {
            result=result *number1;
        }
        System.out.println("the result of "+number1+" power "+power+" is "+result);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");



/*5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers. */

        int check =0;
        int resultpos=0;
        int resultnig =0;
        for(int i =1;i<=5;i++){
            System.out.println("Enter integer number: ");
            check = input.nextInt();
            if(check %2==0){
               resultpos = resultpos+check;
            }
            else if (check%2==1){
                resultnig = resultnig+check;
            }
            else{
                System.out.println("please enter integer number");
            }

        }
        System.out.println("the sum of even numbers = "+ resultpos);
        System.out.println("the sum of odd numbers = "+ resultnig);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

/*6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number. */

        System.out.println("Enter positive integer: ");
       int  prime = input.nextInt();
       boolean flagcheck=true;

       for(int i =2;i<prime;i++){
           if(prime% i==0 && prime>=1){
               flagcheck=false;
               break;
           }
       }
           if (flagcheck) {
               System.out.println("The number "+ prime+" is prime ");
           } else   {
               System.out.println("The number "+ prime+" is not prime ");
           }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
/*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
Expected Output: */
           for (int i = 1; i <=4; i++) {
               System.out.println("Week "+i);
               for (int j = 1; j <=7; j++) {
                   System.out.println("day "+ j);
               }
           }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

input.nextLine();
/*8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left. */
           String finalword="";
           String word ;
        System.out.println("enter a word ");
        word = input.nextLine();
        for(int i =word.length()-1;i>=0;i--){
            finalword = finalword+ word.charAt(i);
            System.out.println(finalword);
        }
        if (word.equalsIgnoreCase(finalword)) {
            System.out.println(word+ " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}




