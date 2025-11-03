package Week4Day2_Project2;

public class Car {
    private int code;
    private Route route;
    private int maximumCapacity;

    public Car(){}

    public Car(int code,int maximumCapacity ,Route route){
        this.code=code;
        this.maximumCapacity=maximumCapacity;
        this.route=route;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
