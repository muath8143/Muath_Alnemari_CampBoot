import java.util.Scanner;
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

        String username = (" Muatht Alnemari ");
        System.out.println(username.toLowerCase());
        System.out.println(username.trim());
        System.out.println(username.toUpperCase());
        System.out.println(username.replace(username, "ahmad"));
        System.out.println(username.startsWith("mu"));
        System.out.println(username.endsWith("a"));
        System.out.println(username.contains("h"));
        System.out.println(username.getBytes());
        System.out.println(username.equals("muath"));



    }
}
