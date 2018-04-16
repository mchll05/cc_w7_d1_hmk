import AttractionStuff.RollerCoaster;
import AttractionStuff.Dodgems;
import AttractionStuff.Park;
import AttractionStuff.Playground;
import AttractionStuff.Attraction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttractionsTest {

    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    Park park;
    Playground playground;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("Ghoster Coaster");
        dodgems = new Dodgems("Bumper Cars");
        park = new Park("Play Land");
        playground = new Playground("Kid's Palace");
    }

    @Test
    public void hasName(){
        assertEquals("Ghoster Coaster", rollerCoaster.getName());
    }
}
