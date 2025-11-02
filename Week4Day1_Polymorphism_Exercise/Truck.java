package Week4Day1_Polymorphism_Exercise;

public class Truck implements Vehicle{
    private String type;
    private int week;

    public Truck(String type,int week){
        this.type=type;
        this.week=week;
    }
    public double calculateRentalCost(){
        return week*500;
    }

    public void displayDetails(){
        System.out.println("Type truck: "+getType());
        System.out.println("weekly Rental Rate: $500.0");
        System.out.println("Rental Cost: $"+calculateRentalCost());
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
