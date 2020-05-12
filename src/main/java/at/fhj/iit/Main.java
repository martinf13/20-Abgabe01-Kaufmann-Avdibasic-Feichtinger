package at.fhj.iit;

/**
 *
 * The Main class contains the main method
 *
 */

public class Main {

    /**
     *
     * @param args - of the main method
     */

    public static void main(String[] args) {

        /**
         * Creating object Cocktail cubaLibre
         */

        Cocktail cubaLibre = new Cocktail ("Cuba Libre");
        /**
         * adding the liquids to the Cocktail
         */
        cubaLibre.addLiquid(new Liquid ("White rum", 0.04, 40));
        cubaLibre.addLiquid(new Liquid ( "Cola", 0.12, 0));
        cubaLibre.addLiquid(new Liquid("Fresh lime juice", 0.02, 0));
        /**
         * Adding the guide step by step to the recipe
         */
        cubaLibre.buildRecipe(" Fill the glass with ice");
        cubaLibre.buildRecipe(" Squeeze and drop 2 lime wedges into the glass");
        cubaLibre.buildRecipe(" Pour in 4cl rum");
        cubaLibre.buildRecipe(" Top up with 12cl of cola");
        cubaLibre.buildRecipe( "Stir it gently!");
        /**
         * Printing out the Cocktail
         */
        System.out.println(cubaLibre.name +":\n" +"Alcohol percentage of the cocktail is " + cubaLibre.getAlcoholPercent()+"%"+"\n" +
                "Total volume of the cocktail in cl is: " +cubaLibre.getVolume() + "\nThe coctail contains alcohol (true/false): " +
                cubaLibre.isAlcoholic() + "\n" +	cubaLibre.toString());

        /**
         * Creating object Cocktail virginColada
         */

        Cocktail virginColada = new Cocktail ("Virgin Colada");
        /**
         * adding the liquids to the Cocktail
         */
        virginColada.addLiquid(new Liquid ("Whipped cream", 0.02, 0));
        virginColada.addLiquid(new Liquid ("Coconut milk", 0.04, 0));
        virginColada.addLiquid(new Liquid ("Pineapple juice", 0.16, 0));
        cubaLibre.addLiquid(new Liquid("Fresh lime juice", 0.02, 0));
        /**
         * Adding the guide step by step to the recipe
         */
        virginColada.buildRecipe(" Fill the glass with ice");
        virginColada.buildRecipe(" Pour the ingredients in the shaker and shake it for 20s");
        virginColada.buildRecipe(" Pour the mixed ingredients from the shaker in the glass");
        virginColada.buildRecipe(" Decorate it with the slice of pineapple or honeydew melon!");
        /**
         * Printing out the Cocktail
         */
        System.out.println("\n" + virginColada.name+":\nAlcohol percentage of the cocktail is " + virginColada.getAlcoholPercent()+"%"+"\n" +
                "Total volume of the cocktail in cl is: " +virginColada.getVolume()+"\nThe coctail contains alcohol (true/false): " +
                virginColada.isAlcoholic() +"\n" +	virginColada.toString());

    }
}

