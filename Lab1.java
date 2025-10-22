import java.util.Locale;
import java.util.Scanner;
import java.lang.Integer;

public class Lab1 {
    public static void main(String[] args) {
        // Q1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int FirstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int SecondNumber = input.nextInt();
        int sum = FirstNumber+SecondNumber;
        System.out.println(FirstNumber+ " + " +SecondNumber+" ="+ sum);
        int difference = FirstNumber-SecondNumber;
        System.out.println(FirstNumber +" - " +SecondNumber+ " = "+ difference);
        int multiply = FirstNumber*SecondNumber;
        System.out.println(FirstNumber +" * " +SecondNumber+ " = "+ multiply);
        if (SecondNumber ==0){
            System.out.println("the division on 0 is unknown");
        }
        else{
            int div = FirstNumber/SecondNumber;
            System.out.println(FirstNumber +" / " +SecondNumber+ "= "+div);
        }

        int mod = FirstNumber%SecondNumber;
        System.out.println(FirstNumber +" mod " +SecondNumber+ "= "+mod);

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*2*/
        System.out.println("Enter your number ");
        int multiplication = input.nextInt();
        int result =1;
        for(int i=1;i<=10;i++){
            result = i*multiplication;
            System.out.println(multiplication+" x "+i+" = "+result);
        }

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*3*/
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        double bi =3.14;
        double perimeter=bi*(radius*2);
        double area= bi * (radius * radius);
        System.out.println("Area is = "+area);
        System.out.println("Perimeter is = " + perimeter);

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*4*/

        System.out.println("Enter the count of numbers:");
        int numbers = input.nextInt();
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
//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*5*/
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third number:");
        int thirdNumber = input.nextInt();
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
        orignal = input.nextLine();
        for(int i = orignal.length()-1;i>=0;i--){
            reverse = reverse + orignal.charAt(i);
        }
        System.out.println("the orignal word is "+ orignal);
        System.out.println("the reverse word is "+ reverse);

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*7*/
        System.out.println("enter the number you want check: ");
        int iseven = input.nextInt();
        if (iseven%2==0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*8*/
        System.out.println("the temperature in Centigrade: ");
        double Centigrade=input.nextDouble();
        System.out.printf("Temperature in Fahrenheit is: %.2f%n",(Centigrade*1.8)+32);

        input.nextLine();

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*9*/
        char find;
        System.out.println("enter a state");
        String state=input.nextLine();
        System.out.println("Enter the index you want from state");
        int index=input.nextInt();
        find=state.charAt(index);
        System.out.println(find);

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*10*/
        double Width;
        double Height;
        System.out.println("Enter the width: ");
        Width = input.nextDouble();
        System.out.println("Enter the height: ");
        Height = input.nextDouble();
        System.out.println("Area is " +Width +" * "+ Height+ " = "+ (Width*Height));
        System.out.println("Perimeter is 2 * ("+Width+"+"+Height+") =  "+ 2* (Width+Height));

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*11*/
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

        System.out.println(hours+":"+min+":"+sec);

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*13*/
        boolean flag = true;
        System.out.println("enter first number to compare: ");
        int compare3 = input.nextInt();
        System.out.println("Enter second number to compare: ");
        int compare4 = input.nextInt();
        System.out.println("Enter third number to compare: ");
        int compare5 = input.nextInt();
        System.out.println("Enter forth number to compare: ");
        int compare6 = input.nextInt();
        if(compare3==compare4&&compare3==compare5&&compare3==compare6){
            System.out.println("Numbers are equal! ");
        }
        else {
            System.out.println("Numbers are not equal! ");
        }


        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*14*/
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

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*15*/

        int much ;
        int countpos =0;
        int countnig=0;
        int countzero = 0;
        System.out.println("Enter numbers ,, if you done write -1");
        do {
            much = input.nextInt();
            System.out.println("Enter number");
            if(much> -1&& much!=0 ){
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


        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        //16

        System.out.println("enter intger number you want revers digit");
        int originalnumber = input.nextInt();
        String stringnumber = Integer.toString(originalnumber);
        StringBuilder string_number = new StringBuilder(stringnumber);
        System.out.println("The reverse number "+ originalnumber + " is "+string_number.reverse());

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        /*17*/
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

input.nextLine();

//-------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        /*18*/
        int conta=0;
        String cahrt="a";
        System.out.println("Enter a text");
        String serchtext = input.nextLine();
        for(int i=0;i<=serchtext.length()-1;i++){
            if(serchtext.toLowerCase(Locale.ROOT).charAt(i)==cahrt.charAt(0)){
                conta++;
            }
        }
        System.out.println("Number of a is:"+conta);
    }
}
