package at.fhj.iit;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * Class represents a Cocktail which is a mix of different liquids that extends Drink
 *
 */


public class Cocktail extends Drink {

    /**
     * Uses list where different liquids will be saved
     */
    private List<Liquid> listOfLiquids = new LinkedList<Liquid>();

    /**
     * Uses TreeMap where the recipe will be saved step by step
     */
    private TreeMap<Integer, String> recipe = new TreeMap<Integer, String>();

    /**
     * Counting index for the buildRecipe steps
     */
    protected  int index = 0;

    /**
     * Creates a Cocktail object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name ) {
        super(name);
    }

    /**
     * Generates the toString output of the recipe
     */

    @Override
    public String toString() {
        return "This is a guide for your cocktail: "  +"\n"+ recipe;
    }

    /**
     * Adding the string text to the recipe and automatically increasing the index(step)
     *
     * @param text to build up the recipe
     */

    public void buildRecipe(String text) {

            recipe.put(++index, text);

    }

    /**
     * Calculates and rounds the number of decimals
     *
     * @param value	- value of the double that needs to be rounded
     * @param places - number of decimals that should be rounded
     * @return double value with int places number of decimals
     */

    public static double round(double value, int places) {
        try {
            if (places < 0) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter rounded on two decimals
     */

    @Override
    public double getVolume() {
        double volume = 0;
        for(int i=0;i<listOfLiquids.size();i++){
            volume += listOfLiquids.get(i).getVolume();
        }
        return round(volume,2) * 100;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent rounded on 2 decimals (e.g. 50)
     */


    @Override
    public double getAlcoholPercent() {
        double percentage = 0;
        double pureAlc = 0;
        double sumVolume = 0;
        for(int i=0;i<listOfLiquids.size();i++){
            pureAlc += listOfLiquids.get(i).getVolume() * (listOfLiquids.get(i).getAlcoholPercent() / 100);
        }
        for(int i=0;i<listOfLiquids.size();i++){
            sumVolume += listOfLiquids.get(i).getVolume();
        }
        percentage = (pureAlc / sumVolume) * 100;
        return round(percentage,2);
    }



    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(getAlcoholPercent() > 0){
            return true;
        } else return false;
    }

    /**
     * adds a Liquid to the Cocktail's listOfLiquids.
     *
     * @param l Object of Type Liquid that should be added to the Cocktail.
     */
    public void addLiquid(Liquid l) {
        listOfLiquids.add(l);
    }


    public List<Liquid> getListOfLiquids() {
        return listOfLiquids;
    }

    public TreeMap<Integer, String> getRecipe() {
        return recipe;
    }


}
