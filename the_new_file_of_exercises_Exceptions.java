import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Integer;
public class the_new_file_of_exercises_Exceptions {
    public static void comp(int a ,int b,int c,int d) throws Exception{
        if(a==b&&a==d&&a==c){
            System.out.println("Numbers are equal! ");
        }
        else {
            throw new Exception("The numbers not equal");
        }

    }
    public static void main(String[] args) {
        // Q1
        int FirstNumber=0;
        int SecondNumber=0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            FirstNumber = input.nextInt();
            System.out.println("Enter second number: ");
            SecondNumber = input.nextInt();
            int sum = FirstNumber+SecondNumber;
            System.out.println(FirstNumber+ " + " +SecondNumber+" ="+ sum);
            int difference = FirstNumber-SecondNumber;
            System.out.println(FirstNumber +" - " +SecondNumber+ " = "+ difference);
            int multiply = FirstNumber*SecondNumber;
            System.out.println(FirstNumber +" * " +SecondNumber+ " = "+ multiply);
            int div = FirstNumber/SecondNumber;
            System.out.println(FirstNumber +" / " +SecondNumber+ "= "+div);
            int mod = FirstNumber%SecondNumber;
            System.out.println(FirstNumber +" mod " +SecondNumber+ "= "+mod);

        }catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }

        catch (ArithmeticException e){
            System.out.println("Can not "+e.getMessage());
        }
        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*2*/input.nextLine();
        System.out.println("Enter your number ");
        int multiplication=0;
        try {
            multiplication = input.nextInt();
            int result =1;
            for(int i=1;i<=10;i++){
                result = i*multiplication;
                System.out.println(multiplication+" x "+i+" = "+result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        }


//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        input.nextLine();
        /*3*/
        System.out.println("Enter the radius: ");
        try {
            double radius = input.nextDouble();
            if (radius==0){
                throw new Exception("You enter 0 so you don't have a circle");
            }
            double bi =3.14;
            double perimeter=bi*(radius*2);
            double area= bi * (radius * radius);
            System.out.println("Area is = "+area);
            System.out.println("Perimeter is = " + perimeter);
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*4*/
        input.nextLine();
        int numbers =0;
        System.out.println("Enter the count of numbers:");
        try {
            numbers=input.nextInt();
            if (numbers<=0){
                throw new Exception("The number should be > 0");
            }
        }catch (Exception e){
            System.out.println("enter a number");
        }

        try {
            double avg;
            double som=0;
            int number;
            for(int i=1;i<=numbers;i++){
                System.out.println("Enter an integer: ");
                number = input.nextInt();
                som = som+number;
            }
            avg= som/numbers;
            System.out.println("The average is: "+avg);
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        input.nextLine();

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*5*/
        int firstNumber=0;
        int secondNumber=0;
        int thirdNumber=0;
        System.out.println("Enter the first number:");
        try {
            firstNumber = input.nextInt();
            System.out.println("Enter second number:");
            secondNumber = input.nextInt();
            System.out.println("Enter the third number:");
            thirdNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("enter a number ");
        }
        int sum2 =  firstNumber+secondNumber;
        System.out.println("the first number is "+firstNumber);
        System.out.println("the second number is "+secondNumber);
        System.out.println("the third number is "+thirdNumber);

        if (sum2==thirdNumber){
            System.out.println("the result is true");
        }
        else {
            System.out.println("the result is false");
        }
        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*6*/
        String orignal="";
        String reverse="";

        System.out.println("Enter your word:");
        try {
            orignal = input.nextLine();
            if (orignal.isEmpty()){
                throw new Exception("you dont write any thing");
            }
            for(int i = orignal.length()-1;i>=0;i--){
                reverse = reverse + orignal.charAt(i);
            }
            System.out.println("the orignal word is "+ orignal);
            System.out.println("the reverse word is "+ reverse);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*7*/
        int iseven;
        System.out.println("enter the number you want check: ");
        try {
            iseven = input.nextInt();
            if(iseven==0) {
                throw new RuntimeException("The number is zero");
            }
            if (iseven%2==0){
                System.out.println("the number is even");
            }
            else {
                System.out.println("the number is odd");
            }
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        input.nextLine();


        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*8*/try {
            System.out.println("the temperature in Centigrade: ");
            double Centigrade=input.nextDouble();
            System.out.printf("Temperature in Fahrenheit is: %.2f%n",(Centigrade*1.8)+32);
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }


        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*9*/
        char find;
        System.out.println("enter a state");
        String state=input.nextLine();
        System.out.println("Enter the index you want from state between " +0+ " and "+(state.length()-1));
        try {
            int index=input.nextInt();
            find=state.charAt(index);
            System.out.println(find);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("please enter a number between " +0+ " and "+(state.length()-1));
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        input.nextLine();

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*10*/
        double Width;
        double Height;
        System.out.println("Enter the width: ");
        try {
            Width = input.nextDouble();
            System.out.println("Enter the height: ");
            Height = input.nextDouble();
            System.out.println("Area is " +Width +" * "+ Height+ " = "+ (Width*Height));
            System.out.println("Perimeter is 2 * ("+Width+"+"+Height+") =  "+ 2* (Width+Height));
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*11*/
        try {
            System.out.println("Enter first number to compare: ");
            int compare1 = input.nextInt();
            System.out.println("Enter  second number to compare: ");
            int compare2 = input.nextInt();

            if(compare1==compare2){
                System.out.println(compare1 + " = "+ compare2);
            }
            else {
                System.out.println(compare1 + " != "+ compare2);
            }
            if(compare1<=compare2){
                System.out.println(compare1 + " <= "+ compare2);
            }
            else{
                System.out.println(compare1 + " > "+ compare2);
            }
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*12*/

        int min;
        int hours;
        System.out.println("enter seconds number  ");
        int sec= input.nextInt();
        hours=sec /3600;
        min= (sec % 3600)/60;
        int sece = sec % 60;

        System.out.println(hours+":"+min+":"+sece);
        input.nextLine();

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*13*/try {
            System.out.println("enter first number to compare: ");
            int compare3 = input.nextInt();
            System.out.println("Enter second number to compare: ");
            int compare4 = input.nextInt();
            System.out.println("Enter third number to compare: ");
            int compare5 = input.nextInt();
            System.out.println("Enter forth number to compare: ");
            int compare6 = input.nextInt();
            comp(compare3,compare4,compare5,compare6);
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*14*/
        try {
            System.out.println("Enter a number check is negative, zero, or positive.");
            int check = input.nextInt();
            if(check>0){
                System.out.println("The number is positive");
            } else if (check<0) {
                System.out.println("The number is negative");
            }
            else{
                System.out.println("The number is zero ");
            }
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        input.nextLine();
        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*15*/
        int much ;
        int countpos =0;
        int countnig=0;
        int countzero = 0;

        try {
            do {
                System.out.println("Enter numbers ,, if you done write -1");
                much = input.nextInt();
                if(much==-1&&countnig==0&&countpos==0&&countzero==0){
                    throw new Exception("you dont enter any numbers");
                }
                if(much> -1&&much!=0 ){
                    countpos++;
                } else if (much< -1) {
                    countnig++;
                }
                else if(much==0){
                    countzero++;
                }
                else {
                    break;
                }

            }while (true);
            System.out.println(countpos+" positives");
            System.out.println(countnig+" negatives");
            System.out.println(countzero+" zeroes");
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        //16
        try {
            System.out.println("enter integer number you want revers digit");
            int originalnumber = input.nextInt();
            String stringnumber = Integer.toString(originalnumber);
            if (stringnumber.length()<2){
                throw new Exception("you write 1 digit only i can't revers it");
            }
            StringBuilder string_number = new StringBuilder(stringnumber);
            System.out.println("The reverse number "+ originalnumber + " is "+string_number.reverse());

        }catch (InputMismatchException e){
            System.out.println("please enter a integer number");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*17*/
        try {
            System.out.println("Enter how much you want of numbers ");
            int countmuch = input.nextInt();
            System.out.println("Enter number");
            int realnumber= input.nextInt();
            int big=realnumber;
            int small=realnumber;
            for (int i = 1; i < countmuch; i++) {
                System.out.println("Enter number");
                realnumber= input.nextInt();
                if(realnumber>big){
                    big = realnumber;
                }
                if(realnumber<small){
                    small = realnumber;
                }

            }
            System.out.println("the large number is "+big);
            System.out.println("the small number is "+small);
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }


        input.nextLine();

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*18*/try {
            int conta=0;
            String cahrt="a";
            System.out.println("Enter a text");
            String serchtext = input.nextLine();
            if (serchtext.isEmpty()){
                throw new Exception("you dont write any thing");
            }
            for(int i=0;i<=serchtext.length()-1;i++){
                if(serchtext.toLowerCase(Locale.ROOT).charAt(i)==cahrt.charAt(0)){
                    conta++;
                }
            }
            System.out.println("Number of a is:"+conta);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
