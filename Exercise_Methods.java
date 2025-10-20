import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_Methods {
//1 - Write a Java method to find the smallest number among three
//numbers.
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//The smallest value is 25.0
    public static int find (int a,int b ,int c){
        int small=a;
        ArrayList <Integer> numbers =new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        for (int n:numbers){
            if (small<=n){
            }
            else {
                small=n;
            }
        }

return small;
    }

    //2 - Write a Java method that check if the entered number is negative or
    //positive or zero.
    public static void check (ArrayList<Integer> old){
        for (int n:old){
            if(n>0){
                System.out.println("the number is positive");
            } else if (n<0) {
                System.out.println("the number is negative");
            }
            else
                System.out.println("the number is zero");
        }
    }
//3 - Write a Java method to check whether a string is a valid password.
//Password rules:
//A password must have at least ten characters. A
//password consists of only letters and digits. A
//password must contain at least two digits.
//Expected Output:
//1. A password must have at least eight characters.
//2. A password consists of only letters and digits.
//3. A password must contain at least two digits
//Input a password (You are agreeing to the above Terms and
//Conditions.):
//abcd1234
//Password is valid: abcd1234
    public static boolean checkPass(String pass){
        int count=0;
        if(pass.length()<8){
             return false;
        }
        for(char n:pass.toCharArray()){
            if(!Character.isLetterOrDigit(n)){
                return false;
            }
        }
        for (char p:pass.toCharArray()){
            if (Character.isDigit(p)){
                count++;
            }
        }
        if (count>=2){
        return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Q1 -------------------------------------------------------------------------------------------------------------------------------
        int smallest=find(25,20,29);
        System.out.println(smallest);
        //Q2 -------------------------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        ArrayList<Integer> CheckNumber= new ArrayList<>();
        CheckNumber.add(5);
        CheckNumber.add(-7);
        CheckNumber.add(0);
        CheckNumber.add(0);
        CheckNumber.add(2);
        check(CheckNumber);
        //Q2 -------------------------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("1. A password must have at least eight characters.\n2. A password consists of only letters and digits.\n3. A password must contain at least two digits\nInput a password (You are agreeing to the above Terms andConditions)");
        String password=input.nextLine();

        if (checkPass(password))
            System.out.println("password is valid: "+ password);

        else
            System.out.println("password is not valid: " +password);
    }
}
