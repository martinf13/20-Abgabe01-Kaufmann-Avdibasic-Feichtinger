package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Class represents a Shake, which containts 2 fruits and a liquid
 * @author Martin Feichtinger
 */
public class Shake extends Drink {

    /**
     * Uses a String array to save fruits. The size is getting declared in the constructor
     * Uses a List where liquids will be saved
     * Created an protected index, to add to the String Array fruits. If index higher then 1 it we will
     * receive an exception as only 2 fruits are allowed
     */
    private String[] fruits;
    private List<Liquid> listOfLiquids;
    protected int index = 0;


    /**
     * Creates a Shake object with given name and declares the fruits Array with the size of 2
     * Additionally we are creating a "listofLiquids" Array List to save the liquids we use for the Shake.
     *
     * @param name name of the drink
     */
    public Shake(String name) {
        super(name);
        fruits = new String[2];
        listOfLiquids = new ArrayList<>();

    }

    /**
     * Method to get each fruit
     * @return each fruit saved in the fruits String Array
     */
    public String getFruits() {
        String m = "";
        for (int i = 0; i < fruits.length ; i++) {
            if(fruits[i] != null) {
                if(i == 0) {
                    m += fruits[i];
                }
                else m += ", " + fruits[i];
            }
        }
        return m;
    }

    /**
     *Method to save fruits in the String Array
     * @param fruit1 - String which is being saved in the fruits Array List. Maximum 2 fruits are allowed otherwise
     *               you will receive a warning/exception
     */
    public void setFruits(String fruit1) {
        try {
            this.fruits[index] = fruit1;
            index++;
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Only 2 fruits are allowed in this specific Shake");
        }
    }

    /**
     * Getter for the Array
     * @return the whole fruits String Array
     */
    public String[] getStringArray() {
        return this.fruits;
    }

    /**
     * Getter for the List of Liquids
     * @return the whole List of Liquids
     */
    public List<Liquid> getListOfLiquids() {
       return listOfLiquids;
    }

    /**
     * Method to add a Liquid to the List of Liquids
     * @param liquid Object of Type  Liquid that will be added to the list
     */
    public void addLiquid(Liquid liquid) {
        listOfLiquids.add(liquid);
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
        return Math.round(volume * 100.00) / 100.00;
    }


    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
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
        return Math.round(percentage / getVolume() * 100.00) / 100.00 ;
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

}
