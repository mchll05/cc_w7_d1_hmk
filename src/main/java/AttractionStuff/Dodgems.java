package AttractionStuff;

import AttractionStuff.Attraction;
import Interfaces.IChargeable;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements IChargeable{

    int price;

    public Dodgems(String name, int price) {
        super(name);
        this.price = price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <= 12) {
            return price / 2;
        } else {
            return price;

        }
    }
}
