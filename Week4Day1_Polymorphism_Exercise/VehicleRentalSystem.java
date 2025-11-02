package Week4Day1_Polymorphism_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Vehicle>rentedVehicle=new ArrayList<>();
        int choose;
        String name;
        int counter;
        boolean flag=true;
        while (flag){
            System.out.println("-----------------------------------------Vehicle Rental System-----------------------------------------");
            System.out.println("1. Rent a Car \n2. Rent a Bike \n3. Rent a Truck \n4. View Rented Vehicle \n5. Exit");
            System.out.println("Enter your choice");
            choose=input.nextInt();
            input.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Enter car model: ");
                    name=input.nextLine();
                    System.out.println("Enter rental days: ");
                    counter= input.nextInt();
                    Vehicle i=new Car(name,counter);
                    i.displayDetails();
                    rentedVehicle.add(i);
                    break;
                case 2 :
                    System.out.println("Enter bike brand:");
                    name=input.nextLine();
                    System.out.println("Enter rental hours: ");
                    counter= input.nextInt();
                    Vehicle b =new Bike(name,counter);
                    b.displayDetails();
                    rentedVehicle.add(b);
                    break;

                case 3:
                    System.out.println("Enter truck type: ");
                    name=input.nextLine();
                    System.out.println("Enter rental weeks: ");
                    counter= input.nextInt();
                    Vehicle t =new Truck(name,counter);
                    t.displayDetails();
                    rentedVehicle.add(t);
                    break;
                case 4:
                    for (Vehicle v:rentedVehicle){
                        v.displayDetails();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    flag=false;
            }
        }
    }
}
