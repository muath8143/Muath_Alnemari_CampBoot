import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {
//Q1--------------------------------------------------------------------------------------------------------------------
    public static ArrayList<String> findall(ArrayList<String> find){
    String LargeWord=find.getFirst();
    ArrayList<String>newarray=new ArrayList<>();

    for (String f:find){
        if(f.length()>=LargeWord.length()){
            LargeWord=f;
        }
    }

    for (String f:find){
        if (f.length()>=LargeWord.length()){
            newarray.add(f);
        }
    }

    return newarray;
    }
    //Q4------------------------------------------------------------------------------------------------------------------
    public static ArrayList<Integer> revers(ArrayList<Integer> search){
        int counter=0;
        int counteroutloop=search.size()-1;

        for (int i=search.size()-1;counteroutloop>=0;){
            search.add(counter,search.get(i));
            search.remove(i+1);
            counter++;
            counteroutloop--;
        }
        return search;
    }

    //Q6--------------------------------------------------------------------------------------------------------------
    public static ArrayList<Integer> random (int min ,int max,int nums){
        ArrayList<Integer> newrandom=new ArrayList<>();
        Random rand=new Random();
        for(int i =0;i<nums;i++){
            newrandom.add(rand.nextInt(max-min+1)+min);
        }

        return newrandom;
    }

    //Q7-----------------------------------------------------------

    public static int checkLength(String pass){
        int mark=0;
        if (pass.length()>=0 && pass.length()<=5){
            mark=0;
        }
        else if (pass.length()>=6&&pass.length()<=7){
            mark=2;
        }
        else if (pass.length()>=8){
            mark=3;
        }
        return mark;
    }
    public static int checkSpecialCharacters(String pass){
        ArrayList<Character> toarray=new ArrayList<>();
        int mark=0;
        for (int i=0;i<pass.length();i++){
            toarray.add(pass.charAt(i));
        }
        for (char t:toarray){
            if (!Character.isLetterOrDigit(t)){
                mark=2;
            }
        }
        return mark;
    }

    public static int checkUpperCaseLowerCase(String pass){
        ArrayList<Character> toarray=new ArrayList<>();
        int mark=0;
        for (int i=0;i<pass.length();i++){
            toarray.add(pass.charAt(i));
        }
        for (char t:toarray){
            if (Character.isUpperCase(t)){
                mark=3;
            }
        }
        return mark;
    }

    //Q8--------------------------------------------------------------------------------------------------------
    public static ArrayList<Integer>  Fibonacci(int a){
        ArrayList<Integer> seq =new ArrayList<>();
        if (a==0){
            return seq;
        }
        else if(a==1){
            seq.add(0);
        }
        else {
            seq.add(0);
            seq.add(1);
            for (int i = 2; i < a; i++) {
                seq.add(seq.get(i - 1) + seq.get(i - 2));
            }
        }
        return seq;

    }


//Main method------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //Q1--------------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("red");
        words.add("is");
        words.add("am");
        System.out.println(findall(words));
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        //Q2--------------------------------------------------------------------------------------------------------------------
        int counter=0;
        System.out.println("enter number you want to search ");
        int search= input.nextInt();
        int searchnumber[]= {1,1,1,3,3,5};
        for (int s:searchnumber){
            if (s==search){
                counter++;
            }
        }
        System.out.println(search+" occurs "+counter+" times");

        //Q3---------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        int infint=0;
        int number;
        int count=0;
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> newarray=new ArrayList<>();
        do {
            System.out.println("Enter a number to add in array if done write -1 ");
             number= input.nextInt();
            if (number==-1){
                break;
            }
            numbers.add(number);
        }while (infint==0);
        Collections.sort(numbers);
        System.out.println("Enter the largest number you want");
        int numberoflargest=input.nextInt();
        for (int i=numbers.size()-1;count<numberoflargest;i--){
            newarray.add(numbers.get(i));
            count++;
        }

        System.out.println(numberoflargest+" largest elements of the said array are: "+newarray);

        //Q4---------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        ArrayList<Integer>OrignalArray=new ArrayList<>();
        OrignalArray.add(5);
        OrignalArray.add(4);
        OrignalArray.add(3);
        OrignalArray.add(2);
        OrignalArray.add(1);
        System.out.println(revers(OrignalArray));

        //Q5-----------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        ArrayList<Integer>menu=new ArrayList<>();
        ArrayList<Integer>sort=new ArrayList<>();
        int loop=0;
        int add;
        int searche;
        int size;
        int co=-1;
        boolean flag=true;
        System.out.println("---------------------- Welcome in menu driven ----------------------");
        do {

            System.out.println("1. add elements of an array\n" +
                    "2. Display elements of an array\n" +
                    "3. Search the element within array\n" +
                    "4. Sort the array\n" +
                    "5.To exit enter the size of array ");
            int chose= input.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Enter the number you want to add ");
                    menu.add(input.nextInt());

                    break;
                case 2:
                    System.out.println(menu);
                    break;
                case 3:
                    int j;
                    int flagg=0;
                    System.out.println("Enter the number you want to search");
                    searche=input.nextInt();
                    for(j=0;j<menu.size();j++){
                        if (searche==menu.get(j)){
                            flagg=flagg+1;
                            break;
                        }
                }
                    if (flagg>0){
                        System.out.println("the "+searche +" is exist in index: "+j);
                    }
                    else {
                        System.out.println("the "+searche +" is not exist in index: ");
                    }
                    break;
                case 4:
                    Collections.sort(menu);
                    System.out.println("The array after sort "+menu);
                    break;

                case 5:
                    System.out.println("To exit enter the size of array");
                    size=input.nextInt();
                    if (size==menu.size()){
                        flag=false;
                        break;
                    }
            }
        }while (flag);

        //Q6-----------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter the minimum range");
        int minimum =input.nextInt();
        System.out.println("Enter the maximum range");
        int maximum =input.nextInt();
        System.out.println("Enter how much numbers you want");
        int much= input.nextInt();
        System.out.println(random(minimum,maximum,much));


        //Q7--------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        String password="Muath1234";
        int mark=0;
        mark+=checkLength(password);
        mark+=checkSpecialCharacters(password);
        mark+=checkUpperCaseLowerCase(password);
        if (mark <4){
            System.out.println("Password is weak");
        }
        else if (mark>=4&&mark<=6){
            System.out.println("Password is medium");
        }
        else {
            System.out.println("Password is strong");
        }

        //Q8---------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter the number of Fibonacci terms to generate: ");
        int term=input.nextInt();
        System.out.println("Fibonacci sequence with "+term+" terms:"+Fibonacci(term) );
    }
}
