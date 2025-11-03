package Week4Day2_Project2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Passenger>passengers=new ArrayList<>();
        //Ttrip
        Route r1=new Route("jeddah","makkah",200);
        Route r2 =new Route("Ryiadh","Jeddah",800);


        Car c1 =new Car(1,5,r1);
        Car c2 =new Car (2,0,r2);



        Passenger p1=new SubscribersPassengers("Muath",11233);
        Passenger p2 =new Non_SubscribersPassengers("Ahmad ",11120,true);


        passengers.add(p1);
        passengers.add(p2);


        p1.reservedCar(c1);
        p1.info();
        System.out.println("------------------------------------------------------------------------------------");
        p2.reservedCar(c2);


    }
}
