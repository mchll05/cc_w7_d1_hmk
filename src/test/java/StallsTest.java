import StallStuff.CandyFloss;
import StallStuff.Tobacco;
import StallStuff.IceCream;
import StallStuff.Stall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StallsTest {

    IceCream iceCream;
    CandyFloss candyFloss;
    Tobacco tobacco;

    @Before
    public void before() {
        iceCream = new IceCream("Len and Terry's", "Cleatus Spuckler", 8);
        candyFloss = new CandyFloss("Cloud Nine", "Poppy Petunia", 5);
        tobacco = new Tobacco("Smokey's", "Smokey Joe", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Len and Terry's", iceCream.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Poppy Petunia", candyFloss.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, tobacco.getParkingSpot());
    }
}

