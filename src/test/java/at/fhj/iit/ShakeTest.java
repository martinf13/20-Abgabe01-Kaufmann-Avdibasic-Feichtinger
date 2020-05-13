package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for Shake.java
 * @author Martin Feichtinger
 */
@DisplayName("Testing the implementation of the Shake")
class ShakeTest {

    /**
     * creating 2 shakes which are being used for the testing
     */
    private Shake s1,s2;

    /**
     * declares the 2 shakes with information
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        s1 = new Shake("Banane");
        s1.setFruits("Banane");
        s1.setFruits("Apfel");
        s1.addLiquid(new Liquid("milk", 1.5, 0.00));

        s2 = new Shake("Alcoholic Banana");
        s2.addLiquid(new Liquid("alcmilk", 2, 30.00));
    }

    /**
     *Testing the Constructor
     */
    @Test
    @DisplayName("Testing constructor with Banane")
    public void testShake() {
        assertEquals("Banane", s1.name);
    }

    /**
     * Testing the Method, which returns a String of added Fruits
     * We added Banane and Apfel @ the Setup Phase
     */
    @Test
    @DisplayName("Testing functionality of the Method GetFruits")
    void testGetFruits() {
        assertEquals("Banane, Apfel", s1.getFruits());
    }

    /**
     * Testing the Exception in the Method, which allows to add only 2 fruits. Here we are trying to add a third
     */
    @Test
    @DisplayName("Testing the functionality of the exception in the SetFruits Method")
    void testSetFruitsException() {
        try{
            s1.setFruits("Pflaume");
        }catch(IndexOutOfBoundsException e){
            assertEquals("Only 2 fruits are allowed in this specific Shake", e.getMessage());
        }
    }

    /**
     * Testing the Method, which returns the whole String Array
     */
    @Test
    @DisplayName("Testing if the first added fruit is correct")
    void testGetStringArray() {
        assertEquals("Banane", s1.getStringArray()[0]);
    }

    /**
     * Testing the Method, which returns the list of Liquids
     */
    @Test
    @DisplayName("Testing if the first added liquid is correct")
    void testGetListOfLiquids() {
        assertEquals("milk", s1.getListOfLiquids().get(0).getName());
    }

    /**
     *Testing the addLiquid Method, which adds the provided Liquid into the List
     */
    @Test
    @DisplayName("Testing functionality of the addLiquid Method")
    void testAddLiquid() {
        s1.addLiquid(new Liquid("water", 1.5, 0.00));
        assertEquals("water", s1.getListOfLiquids().get(1).getName());
    }

    /**
     * Testing the getter for Volume
     */
    @Test
    @DisplayName("Testing functionality of the getter for Volume")
    void testGetVolume() {
        assertEquals(1.5,s1.getVolume());
    }

    /**
     * Testing getter for Alcohol Percentage
     */
    @Test
    @DisplayName("Testing functionality of the getter for Alcohol Percent")
    void testGetAlcoholPercent() {
        assertEquals(0.0,s1.getAlcoholPercent());
    }

    /**
     * Testing if the Shake is Alcoholic or not. Therefor I added an alcoholic Shake, which doesn't exist
     */
    @Test
    @DisplayName("Testing functionality of the IsAlcoholic Method")
    void testIsAlcoholic() {
        //Testing shake 1 which should be non alcoholic
        assertFalse(s1.isAlcoholic());
        //Testing shake 2 which should be alcoholic
        assertTrue(s2.isAlcoholic());
    }
}