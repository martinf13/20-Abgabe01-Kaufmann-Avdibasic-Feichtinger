package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for testing SimpleDrink
 * @author Markus Kaufmann
 * @version 1.0
 */
@DisplayName("Testing SimpleDrink")
class SimpleDrinkTest {

    private SimpleDrink drink1, drink2,drink3;

    @BeforeEach
    public void setup(){
        drink1 = new SimpleDrink("Cappy groß", new Liquid("orange juice",0.5,0));
        drink2 = new SimpleDrink("Seidl Bier", new Liquid("beer",0.3,3));
    }

    /**
     * Testing the default Constructor
     */
    @Test
    @DisplayName("testing default-Constructor")
    public void testDefaultConstr(){
        try{
            assertEquals(drink3.getVolume(), null);
            assertEquals(drink3.getAlcoholPercent(), null);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    /**
     * Testing an alcoholic drink
     */
    @Test
    @DisplayName("Testing an alcoholic drink")
    void testAlcoholic() {
        assertEquals("Seidl Bier", drink2.name, "expected: Seidl Bier, test: "+drink2.name);
        assertEquals(0.3, drink2.getVolume(), "expected: 0.3, test: "+drink2.getVolume());
        assertTrue(drink2.isAlcoholic(), "beer should be alcoholic!!");
    }

    /**
     *
     */
    @Test
    @DisplayName("Testing an non-alcoholic drink")
    void testNonAlcoholic() {
        assertEquals("Cappy groß", drink1.name);
        assertEquals(0.5, drink1.getVolume(), "Cappy groß should be half of a liter!"+drink1.getVolume());
        assertFalse(drink1.isAlcoholic(), "orange juice should be non-alcoholic!!");
    }


}