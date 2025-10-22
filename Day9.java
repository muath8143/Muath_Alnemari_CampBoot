import java.util.InputMismatchException;
import java.util.Scanner;
public class Day9 {
    public static String handel(String password) throws Exception{
        int mark=0;
        if(password.length()< 8){
            throw new Exception("The password should be more 8 char");
        }
        for (Character p:password.toCharArray()){
            if (!Character.isLetterOrDigit(p)){
                mark=mark+1;
            }
        }
        if (mark<2){
            throw new Exception("The password should be have at least 2 special");
        }
        return "The password is strong ";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass="M@@uath1234";
        try {
            handel(pass);
            System.out.println(handel(pass));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        String name;
//        int age;
//        double weight;
//        double tall;
//        double bmi;
//        boolean flag=true;

//        System.out.println("enter your name ");
//        name=input.nextLine();

//        int num1=-19;
//        int num2=20;
//        try {
//            if (num1<0||num2 <0){
//                throw new Exception("numbers should largest 0");
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }




//        while (flag) {
//            try {
//                System.out.println("enter your age ");
//                age = input.nextInt();
//                System.out.println("enter your weight in kg: ");
//                weight = input.nextDouble();
//                System.out.println("enter your tall in meter");
//                tall = input.nextDouble();
//                bmi = weight / (tall * tall);
//
//            } catch (InputMismatchException e) {
//                System.out.println(e.getMessage());
//            } catch (ArithmeticException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        int [] ex = new int[5];
//        try {
//            System.out.println(ex[5]);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }


//        System.out.println("Enter your age ");
//
//        try {
//            age = input.nextInt(); //InputMismatchException
//            System.out.println("your age is: " + age);
//            System.out.println(age/0);
//        }catch (InputMismatchException e){
//            System.out.println("please enter number");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
    }
}
