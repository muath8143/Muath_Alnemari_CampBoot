import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Project_Day10 {
    static String [] []  xo= {{"1" , "2" ,"3" },{"4","5","6"} ,{"7","8","9"}};
    static ArrayList <Integer> gen=new ArrayList<>();
    static Random rand = new Random();
    //Minimum Requirements
    //1- Use 2D Array.
    //2- Use method.
    //3- Should Display a Game Board.
    //4- Ask player position.
    //5- Check if the position available, if not available keep asking the player to enter a
    //valid position.
    //6- Computer chose random position and check valid position.
    //7- Checks if either player or Computer has won.
    public static void printBoard(){
        for (String[] x : xo) {
            System.out.println(" ");
            for (String o : x) {
                System.out.print(" | ");
                System.out.print(o);
                System.out.print(" | ");
            }
        }
    }
    public static String winner (String player,String bot){
        // win 1 = [0] [0] , 2 = [0] [1] , 3 = [0] [2] row
        // win 4 = [1] [0] , 5 = [1] [1] , 6 = [1] [2] row
        // win 7 = [2] [0] , 8 = [2] [1] , 9 = [2] [2] row
        if (xo[0][0].equalsIgnoreCase(xo[0] [1])   && xo[0] [0].equalsIgnoreCase(xo[0][2])){
            if (xo[0][0].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        else if (xo[1][0].equalsIgnoreCase(xo[1] [1])   && xo[1] [0].equalsIgnoreCase(xo[1][2])){
            if (xo[1][0].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        else if (xo[2][0].equalsIgnoreCase(xo[2] [1])   && xo[2] [0].equalsIgnoreCase(xo[2][2])){
            if (xo[2][0].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        // win 1 = [0] [0] , 4 = [1] [0] , 7 = [2] [0] col
        // win 2 = [0] [1] , 5 = [1] [1]  , 8 = [2] [1]  col
        // win 3 = [0] [2] , 6 = [1] [2] , 9 = [2] [2] col
        else if (xo[0][0].equalsIgnoreCase(xo[1] [0])   && xo[0] [0].equalsIgnoreCase(xo[2][0])){
            if (xo[0][0].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        else if (xo[0][1].equalsIgnoreCase(xo[1] [1])   && xo[0] [1].equalsIgnoreCase(xo[2][1])){
            if (xo[0][1].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        else if (xo[0][2].equalsIgnoreCase(xo[1] [2])   && xo[0] [2].equalsIgnoreCase(xo[2][2])){
            if (xo[0][2].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        // win 1 = [0] [0], 5 = [1] [1] , 9 = [2] [2] reduis
        // win 3 = [0] [2] , 5 = [1] [1] , 7 = [2] [0] reduis
        else if (xo[0][0].equalsIgnoreCase(xo[1] [1])   && xo[0] [0].equalsIgnoreCase(xo[2][2])){
            if (xo[0][0].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        else if (xo[0][2].equalsIgnoreCase(xo[1] [1])   && xo[0] [2].equalsIgnoreCase(xo[2][0])){
            if (xo[0][2].equalsIgnoreCase(player)){
                return player;
            }
            else {
                return bot;
            }
        }
        else {
            return "";
        }
    }
    public static boolean avaliable (int a , String i ){
        int indexbot=0;
            switch (a) {
                case 1:
                    if (!xo[0][0].equalsIgnoreCase("X") && !xo[0][0].equalsIgnoreCase("O")) {
                        xo[0][0] = i;

                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }
                        return true;
                    }
                    else {
                        return false;
                    }
                case 2:
                    if (!xo[0][1].equalsIgnoreCase("X") && !xo[0][1].equalsIgnoreCase("O")) {
                        xo[0][1] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }
                        return true;
                    }
                    else {
                        return false;
                    }
                case 3:
                    if (!xo[0][2].equalsIgnoreCase("X") && !xo[0][2].equalsIgnoreCase("O")) {
                        xo[0][2] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }
                        return true;
                    }
                    else {
                        return false;
                    }
                case 4:
                    if (!xo[1][0].equalsIgnoreCase("X") && !xo[1][0].equalsIgnoreCase("O")) {
                        xo[1][0] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }
                        return true;
                    }
                    else {
                        return false;
                    }
                case 5:
                    if (!xo[1][1].equalsIgnoreCase("X") && !xo[1][1].equalsIgnoreCase("O")) {
                        xo[1][1] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }
                        return true;
                    }
                    else {
                        return false;
                    }
                case 6:
                    if (!xo[1][2].equalsIgnoreCase("X") && !xo[1][2].equalsIgnoreCase("O")) {
                        xo[1][2] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }
                        return true;
                    }
                    else {
                        return false;
                    }
                case 7:
                    if (!xo[2][0].equalsIgnoreCase("X") && !xo[2][0].equalsIgnoreCase("O")) {
                        xo[2][0] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }

                        return true;
                    }
                    else {
                        return false;
                    }
                case 8:
                    if (!xo[2][1].equalsIgnoreCase("X") && !xo[2][1].equalsIgnoreCase("O")) {
                        xo[2][1] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }

                        return true;
                    }
                    else {
                        return false;
                    }
                case 9:
                    if (!xo[2][2].equalsIgnoreCase("X") && !xo[2][2].equalsIgnoreCase("O")) {
                        xo[2][2] = i;
                        for (int j=0;j<gen.size();j++){
                            if (a==gen.get(j)){
                                indexbot=j;
                                gen.remove(indexbot);
                                break;
                            }
                        }

                        return true;
                    }
                    else {
                        return false;
                    }
                default:
                    return false;
            }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=9;i++){
            gen.add(i);
        }
        boolean flagstrig;
        boolean flagint;
        String inputchoice="";
        String bot="";
        int intchoice=0;
        int countwin=0;
        String win="";
        int index;
        int choisebot;
        boolean flagav=true;
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("-------------------------------- WELCOME IN ACADEMY TWUIQ -------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Enter your choice X , O");
        do {
            try {
                inputchoice =input.nextLine();
                flagstrig =false;
                if (!inputchoice.equalsIgnoreCase("X") && !inputchoice.equalsIgnoreCase("O")){
                    throw new Exception("Please enter X or O");
                }
            }catch (Exception e ){
                System.out.println(e.getMessage());
                flagstrig=true;
            }
        }while (flagstrig);
        if (inputchoice.equalsIgnoreCase("x")){
            bot="o";
        }
        else {
            bot="x";
        }
        printBoard();
        System.out.println(" ");
        do {
            flagint=false;
            try {
                while (win.isEmpty()){
                    System.out.println(" ");
                    System.out.println("Choose the number you want:");
                    intchoice =input.nextInt();
                    flagav=avaliable(intchoice,inputchoice);
                    countwin++;
                    if (!winner(inputchoice,bot).isEmpty()&&flagav&&countwin>=5){
                        win=winner(inputchoice,bot);
                        printBoard();
                        break;
                    }
                    else if(flagav) {
                        if (gen.isEmpty()){
                            printBoard();
                            break;
                        }
                        index = rand.nextInt(gen.size());
                        choisebot = gen.get(index);
                        avaliable(choisebot, bot);
                        countwin++;
                        if (!winner(inputchoice,bot).isEmpty()) {
                            printBoard();
                            win=winner(inputchoice,bot);
                            break;
                        }
                        printBoard();
                    }
                    else {
                        System.out.println();
                        System.out.println("Please choose another number");
                        printBoard();
                        countwin--;
                    }
                }
            }
            catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter a number");
                printBoard();
                flagint=true;
            }
        }while (flagint);

        System.out.println();
        if (win.isEmpty()){
            System.out.println("Draw!! no winner");
        }
        else if(win.equalsIgnoreCase(inputchoice)) {
            System.out.println("Congratulations!! The winner is you");
        } else if (win.equalsIgnoreCase(bot)) {
            System.out.println("Unfortunately, the winner is the computer");
        }
    }
}
