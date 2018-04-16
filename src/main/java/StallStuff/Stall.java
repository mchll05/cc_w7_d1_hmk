package StallStuff;

import Interfaces.IChargeable;
import Interfaces.IEnjoyable;
import ThemePark.Visitor;

public abstract class Stall implements IChargeable, IEnjoyable {

    String name;
    String ownerName;
    int parkingSpot;
    double price;
    int funRating;

    public Stall(String name, String ownerName, int parkingSpot, double price, int funRating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.price = price;
        this.funRating = funRating;
    }

    public String getName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public int getParkingSpot(){
        return parkingSpot;
    }

    public double priceFor(Visitor visitor){
        return price;
    }

    public int getFunRating(){
        return funRating;
    }
}
