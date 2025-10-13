import java.util.Scanner;
import java.lang.StringBuilder;
public class exercises1 {
    public static void main(String[] args) {

/*1. Develop a program that takes the weight (in kilograms) and height (in meters)
as input and calculates the BMI, then prints it.

• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86*/
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator BMI");
        System.out.println("Please enter your weight (in kilograms): ");
        double Weight = input.nextDouble();
        System.out.println("Please enter your height (in meters): ");
        double Height = input.nextDouble();
        double Bmi = Weight / (Math.pow(Height, 2));
        System.out.printf(" Your BMI is = %.2f%n ",Bmi);
        System.out.println("----------------------------------------------------------------------");


/*2. Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.

• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0% */
        System.out.println("Welcome to Calculator the percentage");
        System.out.println("Please enter obtained_Marks" );
        double Obtained_Marks = input.nextDouble();
        System.out.println("Please enter Total_Marks: ");
        double Total_Marks = input.nextDouble();
        double Percentage = (Obtained_Marks/Total_Marks)* 100;
        System.out.printf("Your percentage is %.2f%%%n ",Percentage);
        System.out.println("----------------------------------------------------------------------");


/*3. Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.

• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0*/
        System.out.println("Welcome to currency converter");
        System.out.println("Please enter the amount you want convert from US dollar ");
        double Amount =  input.nextDouble();
        System.out.println("Please enter the exchange rate ");
        double ExchangeRate = input.nextDouble();
        input.nextLine();
        System.out.println("The amount in currency whose exchange rate you set is =  "+ (ExchangeRate*Amount));
        System.out.println("----------------------------------------------------------------------");


/*4. Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and reversed string.

• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"*/
        System.out.println("write any thing ");
        String OringanText = input.nextLine();
        StringBuilder NewText = new StringBuilder(OringanText);
        System.out.println("Length of the string: "+(OringanText.length())+" and Reversed string: \""+ NewText.reverse()+"\"");
        System.out.println("----------------------------------------------------------------------");


/*5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
= 10, End Index = 20
• Expected Output: "brown fox" */
        System.out.println("Please write the sentence you want to take a part of  ");
        String Sentence1 = input.nextLine();
        System.out.println("Please enter the starting index ");
        int StartIndex = input.nextInt();
        System.out.println("Please enter the ending index ");
        int EndIndex =  input.nextInt();
        input.nextLine();
        String Sentence2 = Sentence1.substring(StartIndex, EndIndex);
        System.out.println("\"" +Sentence2+ "\"");
        System.out.println("----------------------------------------------------------------------");


/*6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword ="jumps"
• Expected Output: Keyword "jumps" is present in the sentence.*/
        System.out.println("write a sentence ");
        String Sentence = input.nextLine();
        System.out.println("write a keyword you want to check for ");
        String Keyword = input.nextLine();
        if (Sentence.contains(Keyword)) {
            System.out.println("Keyword \"" + Keyword + "\" is present in the sentence");
        }
            else {
                System.out.println("Keyword \"" + Keyword + "\" is not present in the sentence");
            }
        System.out.println("----------------------------------------------------------------------");


/*7. Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified sentence.

• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"*/
        System.out.println("write a sentence ");
        String Sentence3 = input.nextLine();
        System.out.println("write a word you want to replace ");
        String WordReplace = input.nextLine();
        System.out.println("write a word you want to Replacement Word");
        String ReplacementWord = input.nextLine();
        String NewSentence = Sentence3.replace(WordReplace,ReplacementWord);
        System.out.println(NewSentence);
        System.out.println("----------------------------------------------------------------------");


/*8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.

• Input: String 1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case).*/
        System.out.println("Enter the first sentence ");
        String FirstSentence = input.nextLine();
        System.out.println("Enter the second sentence ");
        String SecondSentence = input.nextLine();
        if (FirstSentence.equalsIgnoreCase(SecondSentence)) {
            System.out.println("First sentence is equal to second sentence");
        }
        else {
            System.out.println("First sentence is not equal to second sentence");
        }
    }
}
