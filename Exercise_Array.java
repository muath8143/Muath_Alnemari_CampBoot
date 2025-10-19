import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class Exercise_Array {
     public static void main(String[] args) {

         //1.Write a Java program to test if the first and the last element of an array of
         //integers are same. The length of the array must be greater than or equal to
         //Test Data:
         //array = 50, -20, 0, 30, 40, 60, 10
         //Sample Output: false
         Random rand =new Random();
         ArrayList <Integer> test = new ArrayList<>();
          test.add(rand.nextInt(10));
          test.add(rand.nextInt(10));
          test.add(rand.nextInt(10));
          test.add(rand.nextInt(10));
         if (test.size() >=2) {
             if (test.getFirst()== test.getLast()){
                 System.out.println("The first number "+ test.getFirst()+" is equal last number "+test.getLast());
             }
             else {
                 System.out.println("The first number "+ test.getFirst()+" is not equal last number "+test.getLast());
             }
             System.out.println("------------------------------------------------------------------------------------------------------------");
         }
         else
             System.out.println("the array must be greater than or equal");

        //2.Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.
        //Original Array:
        //[1, 4, 17, 7, 25, 3, 100]
         double [] find = {1,4,17,7,25,20,18};
         double avg;
         double count=0;

         for (int i=0;i<find.length;i++){
            count = count+find[i];
         }
         avg =count/(find.length);
         System.out.println("The average array is : "+ avg);
         System.out.println("The numbers greater average is ");
         for (int i=0;i< find.length;i++){
             if (find[i]>avg){
                 System.out.println(find[i]);
             }
         }
         System.out.println("------------------------------------------------------------------------------------------------------------");

         //3.Write a Java program to get the larger value between first and last
         //element of an array of integers.
         //Original Array:
         //[20, 30, 40]
         //Sample Output:
         //Larger value between first and last element: 40
         int [] larger = {20,30,40};
         if (larger[0]>larger[larger.length-1]){
             System.out.println("Larger value between first and last element: "+larger[0]);
         }
         else if(larger[larger.length-1]>larger[0]){
             System.out.println("larger value between first and last element:"+ larger[larger.length-1]);
         }
         else {
             System.out.println("first and last element is equal ");
         }
         System.out.println("------------------------------------------------------------------------------------------------------------");

         //4.Write a Java program to swap the first and last elements of an array and
         //create a new array.
         //Original Array:
         //[20, 30, 40]
         //Sample Output:
         //New array after swapping the first and last elements: [40, 30, 20]
         int [] orignal = {20,40,100,90};
         int [] swap = new int[4];
         for (int i=0;i< orignal.length;i++){
             if (i==0 ){
                 swap[i]= orignal[orignal.length-1];
             } else if (i==swap.length-1) {
                 swap[i]=orignal[0];
             }
             else{
                 swap[i]=orignal[i];
             }
         }
         for(int n:swap){
             System.out.print(n);
             System.out.print(" ");
         }
         System.out.println("");
         System.out.println("------------------------------------------------------------------------------------------------------------");

         //5. Write a program that places the odd elements of an array before the
         //even elements.
         //Original Array:
         //[2,3,40,1,5,9,4,10,7]
         //Sample Output:
         //[3,1,5,9,7,2,40,4,10]
         ArrayList <Integer> place = new ArrayList<>();
         place.add(2);
         place.add(3);
         place.add(40);
         place.add(1);
         place.add(5);
         place.add(9);
         place.add(4);
         place.add(10);
         place.add(7);
         System.out.println("The origenal array is: "+place);
         int counter =0;
         for (int i=0;i<place.size();i++){
             if (place.get(i) %2!=0){
                 place.add(counter, place.get(i));
                 place.remove(i+1);
                 counter++;
             }
         }
         System.out.println("The new array: "+place);
         System.out.println("------------------------------------------------------------------------------------------------------------");

        //6. Write a program that test the equality of two arrays.
         //[2,3,6,6,4] [2,3,6,6,4]
         //Sample Output: true
         int [] testequality1 = {1,4,17,7,25,3,99};
         int [] testequality2 = {1,4,17,7,25,3,100};
         boolean flag =true;
         if(testequality1.length==testequality2.length){
             for(int i=0;i<testequality1.length;i++){
                 if (testequality1[i]==testequality2[i])
                     flag=true;
                 else
                     flag=false;
             }
             System.out.println(flag);
         }
         else
             System.out.println("The length of the two arrays is not equal so i can't compare");
     }
}