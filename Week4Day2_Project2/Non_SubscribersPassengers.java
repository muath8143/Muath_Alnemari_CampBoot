package Week4Day2_Project2;

public class Non_SubscribersPassengers extends Passenger{
   final boolean discountCoupon;
   Car c=new Car();
    public Non_SubscribersPassengers(String name,int id ,boolean discountCoupon){
        super(name,id);
        this.discountCoupon=discountCoupon;

    }

    @Override
    public void reservedCar(Car car) {
        c=car;
        try {
            if (car.getMaximumCapacity() == 0) {
                throw new NullPointerException();
            }
            if (discountCoupon){

                tripCost=car.getRoute().getTripPrice() -(car.getRoute().getTripPrice()*0.1);
                reserved=car;
                car.setMaximumCapacity(car.getMaximumCapacity()-1);
            }
            else{
                car.setMaximumCapacity(car.getMaximumCapacity()-1);
                tripCost=car.getRoute().getTripPrice();
                reserved=car;
            }
        }catch (NullPointerException e){
            System.out.println("Sorry this trip is full");
        }

    }

    @Override
    public void Display() {
        System.out.println("The code of car: "+reserved.getCode());
        System.out.println("The route price ="+tripCost);
    }
    public void info(){
        System.out.println("the name of passenger: "+ super.getName() +"\nthe Id "+super.getId()+"\nthe car: "+ c.getCode() +"\nthe trip: "+c.getRoute().getStartPickupAddress() +" to "+ c.getRoute().getDestination()+"\nThe price of trip: "+tripCost);
    }

}
