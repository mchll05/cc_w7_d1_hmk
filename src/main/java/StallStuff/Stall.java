package StallStuff;

public abstract class Stall {

    String name;
    String ownerName;
    int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

}
