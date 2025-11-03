package Week4Day2_Project2;

public abstract class Passenger {
    protected String name;
    protected int id;
    protected double tripCost;
    protected Car reserved;
    protected double beforeTripCost;

    public Passenger(String name, int id) {
        this.name=name;
        this.id=id;

    }

    public abstract void reservedCar(Car car);

    public abstract void Display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void info();
}
