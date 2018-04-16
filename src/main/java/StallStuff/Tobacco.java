package StallStuff;

import Interfaces.IRestrictable;
import StallStuff.Stall;
import ThemePark.Visitor;

public class Tobacco extends Stall implements IRestrictable {

    public Tobacco(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 18;
    }
}
