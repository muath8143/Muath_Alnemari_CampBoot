package Week4Day2_Project2;

public class Route {
   private String startPickupAddress;
   private String destination;
    private double tripPrice;
    public Route(String startPickupAddress,String destination,int tripPrice){
        this.startPickupAddress=startPickupAddress;
        this.destination=destination;
        this.tripPrice=tripPrice;
    }
    public String getStartPickupAddress() {
        return startPickupAddress;
    }

    public void setStartPickupAddress(String startPickupAddress) {
        this.startPickupAddress = startPickupAddress;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }
}
