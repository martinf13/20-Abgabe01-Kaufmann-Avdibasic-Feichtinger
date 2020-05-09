package at.fhj.iit;

import java.util.List;
import java.util.TreeMap;

public class Cocktail extends Drink {

    private List<Liquid> listOfLiquids = new List<Liquid>();
    private TreeMap<Integer, String> recipe = new TreeMap<Integer, String>;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name) {
        super(name);
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for(int i=0;i<listOfLiquids.size();i++){
           volume += listOfLiquids.get(i).getVolume();
        }
        return volume;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        double percentage = 0;
        for(int i=0;i<listOfLiquids.size();i++){
            percentage += listOfLiquids.get(i).getAlcoholPercent();
        }
        return percentage;
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




}
