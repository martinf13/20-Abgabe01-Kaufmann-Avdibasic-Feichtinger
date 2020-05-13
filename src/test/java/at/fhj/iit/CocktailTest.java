package at.fhj.iit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for testing Cocktail.java
 *
 * @author Markus Kaufmann
 * @author Tarik Avdibasic
 * @version %I%, %G%
 */
@DisplayName("Testing the implementation of Cocktail")
class CocktailTest {

    /**
     * Created two Cocktail objects
     */
    private Cocktail cubaLibre, virginColada;



    @BeforeEach
    public void setup(){

        /**
         * inits the Cocktail objects
         */

        cubaLibre = new Cocktail ("Cuba Libre");
        cubaLibre.addLiquid(new Liquid ("White rum", 0.04, 40));
        cubaLibre.addLiquid(new Liquid ( "Cola", 0.12, 0));
        cubaLibre.addLiquid(new Liquid("Fresh lime juice", 0.02, 0));
        cubaLibre.buildRecipe(" Fill the glass with ice");
        cubaLibre.buildRecipe(" Squeeze and drop 2 lime wedges into the glass");
        cubaLibre.buildRecipe(" Pour in 4cl rum");
        cubaLibre.buildRecipe(" Top up with 12cl of cola");
        cubaLibre.buildRecipe( "Stir it gently!");

        virginColada = new Cocktail ("Virgin Colada");
        virginColada.addLiquid(new Liquid ("Whipped cream", 0.02, 0));
        virginColada.addLiquid(new Liquid ("Coconut milk", 0.04, 0));
        virginColada.addLiquid(new Liquid ("Pineapple juice", 0.16, 0));
        virginColada.buildRecipe(" Fill the glass with ice");
        virginColada.buildRecipe(" Pour the ingredients in the shaker and shake it for 20s");
        virginColada.buildRecipe(" Pour the mixed ingredients from the shaker in the glass");
        virginColada.buildRecipe(" Decorate it with the slice of pineapple or honeydew melon!");

    }

    /**
     * Testing if the Constructor name correct is for cubaLibre object.
     */
    @Test
    @DisplayName("Testing constructor name of cubaLibre")
    public void testCocktailCubaLibre(){
        assertEquals("Cuba Libre",cubaLibre.name);

    }
    /**
     * Testing if the Constructor name correct is for virginColada object.
     */
    @Test
    @DisplayName("Testing constructor name of virginColada")
    public void testCocktailVirginColada(){
        assertEquals("Virgin Colada",virginColada.name);
    }


    /**
     * Testing if buildRecipe method gives us correct Integer and
     * String value of the objects cubaLibre
     */
    @Test
    @DisplayName("Testing the buildRecipe method")
    void buildRecipeTest() {
        assertEquals(" Fill the glass with ice", cubaLibre.getRecipe().get(1));
        assertEquals("Stir it gently!", cubaLibre.getRecipe().get(5));
    }


    /**
     * Testing if the round method rounds the double value on 2 decimals
     * of the cubaLibre object.
     */
    @Test
    @DisplayName("Testing functionality of the round method for cubaLibre")
    void testRoundForCubaLibre() {
            assertEquals(18.0, Cocktail.round(cubaLibre.getVolume()),0.01);
    }

    /**
     * Testing if the round method rounds the double value on 2 decimals
     * of the virginColada object.
     */
    @Test
    @DisplayName("Testing functionality of the round method for virginColada")
    void testRoundForVirginColada() {
        assertEquals(22.0, Cocktail.round(virginColada.getVolume()),0.01);
    }

    /**
     * Testing if the getVolume method gives us the correct size of the object cubaLibre
     */
    @Test
    @DisplayName("Testing the size of the volume")
    void testGetVolumeOfCubaLibre() {
        assertEquals(18, cubaLibre.getVolume(), 0.01);
    }
    /**
     * Testing if the getVolume method gives us the correct size of the object virginColada
     */
    @Test
    @DisplayName("Testing the size of the volume")
    void testGetVolumeOfVirginColada() {
        assertEquals(22.0, virginColada.getVolume(), 0.01);
    }

    /**
     * Testing if the getAlcoholPercent gives us the correct percentage of Alcohol
     * for the object cubaLibre
     */
    @Test
    @DisplayName("Testing the percentage of Alcohol")
    void testGetAlcoholPercentForCubaLibra() {
        assertEquals(8.89, cubaLibre.getAlcoholPercent(), 0.01);
    }

    /**
     * Testing if the getAlcoholPercent gives us the correct percentage of Alcohol
     * for the object cubaLibre
     */
    @Test
    @DisplayName("Testing the percentage of Alcohol")
    void testGetAlcoholPercentVirginColada() {
        assertEquals(0.0, virginColada.getAlcoholPercent(), 0.01);
    }

    /**
     * Testing if the Cocktail object contains Alcohol or not
     * gives us boolean value back.
     */
    @Test
    @DisplayName("Testing the isAlcoholic method for the Cocktail object")
    void testIfAlcoholic() {
        assertTrue(cubaLibre.isAlcoholic(), "Cuba Libre should be alcoholic!");
    }

    /**
     * Testing if the Cocktail object contains Alcohol or not
     * gives us boolean value back.
     */
    @Test
    @DisplayName("Testing the isAlcoholic method for the Cocktail object")
    void testIfNonAlcoholic() {
        assertFalse(virginColada.isAlcoholic(), "virgin colada should be non-alcoholic!");
    }

    /**
     * Testing if the liquids are saved correctly in the ListOfLiquids.
     */
    @Test
    @DisplayName("Testing if all liquids are saved in listOfLiquids")
    void testListOfLiquids() {
        assertEquals("White rum", cubaLibre.getListOfLiquids().get(0).getName());
        assertEquals("Cola", cubaLibre.getListOfLiquids().get(1).getName());
        assertEquals("Fresh lime juice", cubaLibre.getListOfLiquids().get(2).getName());
    }


}