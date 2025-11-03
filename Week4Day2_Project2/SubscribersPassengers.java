package Week4Day2_Project2;

public class SubscribersPassengers extends Passenger{
    public SubscribersPassengers(String name,int id){
        super(name,id);
    }
    @Override
    public void reservedCar(Car car) {
        try {
            if (car.getMaximumCapacity() == 0) {
                throw new NullPointerException();
            }
            tripCost = car.getRoute().getTripPrice() * 0.5;
            reserved=car;
            car.setMaximumCapacity(car.getMaximumCapacity()-1);
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
        System.out.println("the name of passenger: "+ super.getName() +"\nthe Id "+super.getId()+"\nthe code of car was reserved: "+ reserved.getCode() +"\nthe trip: "+reserved.getRoute().getStartPickupAddress() +" to "+ reserved.getRoute().getDestination()+"\nThe price of trip before discount: "+reserved.getRoute().getTripPrice()+"\nThe price of trip before discount: "+tripCost);
    }
}
