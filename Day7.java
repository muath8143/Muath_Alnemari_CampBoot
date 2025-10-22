import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Day7 {

    public static void welcome(String name) {
        if (name.length()>5){
            System.out.println("The name "+name +" is long ");
        }
        else {
            System.out.println("The name "+name +" is short");
        }
    }

    public static void even (ArrayList <Integer> check){
        for (int c:check){
            if (c%2==0){
                System.out.println(c+" ");
            }
        }
        return;
    }

    public static int sum (int num1,int num2){
        int result = num1+num2;
        return result;
    }

    public static double avg(double sum){
        double avg = sum/2;
        return avg;
    }

    public static ArrayList<String> withs(String[] name){
        ArrayList<String> newnames=new ArrayList<>();
        for(String c:name){
            if (c.startsWith("s")){
                newnames.add(c);
            }
        }
        return newnames;
    }

//project with almutire
    public static boolean check (int a,int b){
        if ((a>0&& a<=3) && (b>0&& b<=3)){
            return true;
        }
        else
            return false;
    }

    public static String game (int player1 ,int player2){
        int rock = 1;
        int paper = 2;
        int cut = 3;
        String winner="";

        if (player1==rock && player2==rock) {
            // no winner
            System.out.println("Rock VS Rock ");
            winner="Draw no winner";
        }
        else if (player1==rock && player2==paper) {
            // the winer is player 2
            System.out.println("Rock VS Paper");
            winner="The winner is player2 ";
        }
        else if (player1==rock && player2==cut) {
            // the winer is player 1
            System.out.println("Rock VS Scissors");
            winner="The winner is player1 ";
        }
        else if (player1==paper && player2==paper) {
            // no winner
            System.out.println("Paper VS Paper");
            winner="Draw no winner";
        }
        else if (player1==paper && player2==rock) {
            // the winer is player 1
            System.out.println("Paper VS Rock");
            winner="The winner is player1 ";
        }
        else if (player1==paper && player2==cut) {
            //the winner is player2
            System.out.println("Paper VS Scissors");
            winner="The winner is player2 ";
        }
        else if (player1==cut && player2==cut) {
            // no winner
            System.out.println("Scissors VS Scissors");
            winner="Draw no winner";
        }
        else if (player1==cut && player2==paper) {
            // the winer is player 1
            System.out.println("Scissors VS Paper");
            winner="The winner is player1 ";
        }
        else {
            // the winer is player 2
            System.out.println("scissors VS Rock");
            winner="The winner is player2 ";
        }
        return (winner);
    }

    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        Random rand =new Random();
        int player1;
        int player2;
        boolean flag;

        System.out.println("---------------------------------- welcome in (rock , paper, scissors) game ----------------------------------  ");
        System.out.println("Player 1 please to choose \n 1.rock\n 2.paper\n 3.scissors");
        player1=input.nextInt();
        player2=rand.nextInt(3)+1;


        flag=check(player1,player2);

        if (flag){
            String TheWinner=game(player1,player2);
            System.out.println(TheWinner);

        }
        else {
            System.out.println("Please to choose from menu ");
        }




//in class
       /* welcome("Muath");
        ArrayList<Integer> oddeven = new ArrayList<>();
        oddeven.add(4);
        oddeven.add(5);
        oddeven.add(10);
        oddeven.add(1);
        oddeven.add(2);
        oddeven.add(17);
        even(oddeven);
        System.out.println("--------------------------------------------");
        System.out.println("Enter first numbers");
        int num1 = input.nextInt();
        System.out.println("Enter second number ");
        int num2 = input.nextInt();
        int result = sum(num1, num2);
        System.out.println("The result of sum is: " + result);
        System.out.println("The avg is: " + avg(result));

        String[] names = {"sara", "majd", "sami"};
        System.out.println(withs(names));

        */
    }
}

