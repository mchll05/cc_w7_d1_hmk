package AttractionStuff;

import AttractionStuff.Attraction;
import Interfaces.IRestrictable;
import Interfaces.IChargeable;
import ThemePark.Visitor;

public class RollerCoaster extends Attraction implements IRestrictable, IChargeable {

    private int price;

    public RollerCoaster(String name, int price) {
        super(name);
        this.price = price;
    }

    public Boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 12 && visitor.getHeight() >= 145;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <= 12) {
            return price / 2;
        } else {
            return price;

        }
    }
}

