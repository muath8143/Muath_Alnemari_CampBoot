import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        //Q1-----------------------------------------------------------------------
        Scanner input =new Scanner (System.in);
        int big;
        int number =0;
        big = number ;
        for (int i=0;i<3;i++){
            System.out.println("Enter number ");
            number= input.nextInt();
            if (number >big) {
                big = number;
            }
            }
        System.out.println("the largest number is: "+big);

        //Q2-----------------------------------------------------------------------
        input.nextLine();

        System.out.println("please write a word");
        String word=input.nextLine();
        System.out.println("write a number of index");
        int index=input.nextInt();

        if(index>word.length()-1){
            System.out.println("The index you entered is out of bound");
        }
        else {
            char user =word.charAt(index);
            System.out.println("the index of ("+index+") have character: "+user);
        }

        //Q3-----------------------------------------------------------------------
        int count=0;
        int sum=0;
        do {
            System.out.println("Enter a number if you done write -1");
             count = input.nextInt();
            sum=sum+count;

        }while (count!=-1);
        System.out.println("The sum of numbers you entered = "+ (sum+1));


        //Q4-----------------------------------------------------------------------
        int [] find ={10,-12,30,31,-25};
        for (int f:find){
            if (f>0){
                System.out.println(f+" is a positive number");
            }
            else if(f<0){
                System.out.println(f+" is a negative number");
            }
        }

        //Q5-----------------------------------------------------------------------
        String [] words ={"Tuwaiq", "Bootcamp" , "Student","JAVA"};
        String shortt=words[0];
        for (String s:words){
            if(s.length()<shortt.length()){
                shortt=s;
            }
        }
        System.out.println(shortt);
    }
}
