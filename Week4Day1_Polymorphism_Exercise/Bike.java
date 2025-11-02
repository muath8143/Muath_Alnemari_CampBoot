package Week4Day1_Polymorphism_Exercise;

public class Bike implements Vehicle {
    private String brandBike;
    private int hours;

    public Bike(String brandBike,int hours){
        this.brandBike=brandBike;
        this.hours=hours;
    }

    public double calculateRentalCost(){
        return hours*10;
    }

    public void displayDetails(){
        System.out.println("Bike brand: "+getBrandBike());
        System.out.println("Hourly Rental Rate: $10.0");
        System.out.println("Rental Cost: $"+calculateRentalCost());
    }

    public String getBrandBike() {
        return brandBike;
    }

    public void setBrandBike(String brandBike) {
        this.brandBike = brandBike;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
