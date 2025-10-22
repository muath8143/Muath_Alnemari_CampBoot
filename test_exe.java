import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class test_exe {
    public static void comp(int a ,int b,int c,int d) throws Exception{
        if(a==b&&c==d){
            System.out.println("Numbers are equal! ");
        }
        else {
            throw new Exception("The numbers not equal");
        }

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        try {
//            int conta=0;
//            String cahrt="a";
//            System.out.println("Enter a text");
//            String serchtext = input.nextLine();
//            if (serchtext.isEmpty()){
//                throw new Exception("you dont write any thing");
//            }
//            for(int i=0;i<=serchtext.length()-1;i++){
//                if(serchtext.toLowerCase(Locale.ROOT).charAt(i)==cahrt.charAt(0)){
//                    conta++;
//                }
//            }
//            System.out.println("Number of a is:"+conta);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//        try {
//            System.out.println("enter integer number you want revers digit");
//            int originalnumber = input.nextInt();
//            String stringnumber = Integer.toString(originalnumber);
//            if (stringnumber.length()<2){
//                throw new Exception("you write 1 digit only i can't revers it");
//            }
//            StringBuilder string_number = new StringBuilder(stringnumber);
//            System.out.println("The reverse number "+ originalnumber + " is "+string_number.reverse());
//
//        }catch (InputMismatchException e){
//            System.out.println("please enter a integer number");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        int much ;
//        int countpos =0;
//        int countnig=0;
//        int countzero = 0;
//
//        try {
//            do {
//                System.out.println("Enter numbers ,, if you done write -1");
//                much = input.nextInt();
//                if(much==-1&&countnig==0&&countpos==0&&countzero==0){
//                    throw new Exception("you dont enter any numbers");
//                }
//                if(much> -1&&much!=0 ){
//                    countpos++;
//                } else if (much< -1) {
//                    countnig++;
//                }
//                else if(much==0){
//                    countzero++;
//                }
//                else {
//                    break;
//                }
//
//            }while (true);
//            System.out.println(countpos+" positives");
//            System.out.println(countnig+" negatives");
//            System.out.println(countzero+" zeroes");
//        }catch (InputMismatchException e){
//            System.out.println("please enter a number");
//        }catch (Exception e ){
//            System.out.println(e.getMessage());
//        }
//        try {
//            System.out.println("Enter a number check is negative, zero, or positive.");
//            int check = input.nextInt();
//            if(check>0){
//                System.out.println("The number is positive");
//            } else if (check<0) {
//                System.out.println("The number is negative");
//            }
//            else{
//                System.out.println("The number is zero ");
//            }
//        }catch (InputMismatchException e){
//            System.out.println("please enter a number");
//        }
//        try {
//            System.out.println("enter first number to compare: ");
//            int compare3 = input.nextInt();
//            System.out.println("Enter second number to compare: ");
//            int compare4 = input.nextInt();
//            System.out.println("Enter third number to compare: ");
//            int compare5 = input.nextInt();
//            System.out.println("Enter forth number to compare: ");
//            int compare6 = input.nextInt();
//            comp(compare3,compare4,compare5,compare6);
//        }catch (InputMismatchException e){
//            System.out.println("please enter a number");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        //Q4
//        String orignal="";
//        String reverse="";
//
//        System.out.println("Enter your word:");
//        try {
//            orignal = input.nextLine();
//            if (orignal.isEmpty()){
//                throw new Exception("you dont write any thing");
//            }
//            for(int i = orignal.length()-1;i>=0;i--){
//                reverse = reverse + orignal.charAt(i);
//            }
//            System.out.println("the orignal word is "+ orignal);
//            System.out.println("the reverse word is "+ reverse);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//        char find;
//        System.out.println("enter a state");
//        String state=input.nextLine();
//        System.out.println("Enter the index you want from state between " +0+ " and "+(state.length()-1));
//        try {
//            int index=input.nextInt();
//            find=state.charAt(index);
//            System.out.println(find);
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("please enter a number between " +0+ " and "+(state.length()-1));
//        }

//        double Width;
//        double Height;
//        System.out.println("Enter the width: ");
//        try {
//            Width = input.nextDouble();
//            System.out.println("Enter the height: ");
//            Height = input.nextDouble();
//            System.out.println("Area is " +Width +" * "+ Height+ " = "+ (Width*Height));
//            System.out.println("Perimeter is 2 * ("+Width+"+"+Height+") =  "+ 2* (Width+Height));
//        }catch (InputMismatchException e){
//            System.out.println("please enter a number");
//        }

    }
}
