import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  String word ;
        String finalword="";
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

        int min;
        int hours;
        System.out.println("enter seconds number  ");
        int sec= input.nextInt();
        min = sec/60;
        hours=min/60;
        System.out.println(hours+":"+min+":"+sec);

*/
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
String pass="@abcd1234";
        System.out.println("This is string "+pass);
        ArrayList<Character> passarray=new ArrayList<>();
        for(int i=0;i<pass.length();i++){
            passarray.add(pass.charAt(i));
        }
        System.out.println("This is arraylist "+passarray);
        for(char n:passarray){
            if(!Character.isLetterOrDigit(n)){
                System.out.println("all");
            }
        }

    }
}
