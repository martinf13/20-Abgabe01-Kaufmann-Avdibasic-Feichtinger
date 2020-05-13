# 20-Abgabe01-Kaufmann-Avdibasic-Feichtinger - Project Drinks #

**20-Abgabe01-Kaufmann-Avdibasic-Feichtinger Repository**

This [Repository](https://github.com/martinf13/20-Abgabe01-Kaufmann-Avdibasic-Feichtinger.git) contains the project "Drinks" for KONFIG1 exercise 1.

**Contributors**
- [Markus Kaufmann](https://github.com/markuskaufmann87 "Markus Kaufmann")
- [Martin Feichtinger](https://github.com/martinf13 "Martin Feichtinger")
- [Tarik Avdibasic](https://github.com/TarikAvdibasic90 "Tarik Avdibasic")

**Course:**

- Configuration Management (Konfigurationsmanagement)

## Project Description ##

The abstract class **"Drink"** represents the properties of a drink, including methods to get the Volume and the alcohol percentage.
A drink is a mix of liquids, which are represented in the class "Liquid".
The class **"Liquid"** represents properties of a liquid, could be alcoholic or non-alcoholic and different volumes.


## Project Task ##
First we have implemented the **"Cocktail"** class which extends the Drink class and implements the methods of Drink.
For the implementation of the Drink in Cocktail class we have used following variables: TreeMap <Integer, String> and List of Liquids which is implemented from the **"Liquid"** class.

### Implementation 1 – Cocktail ###
Class **"Cocktail"** extends the **"Drink"** class. Cocktail class represents two different aspects of build up the Cocktail drink. 
First one is implemented with the help of **"Liquid"** class and LinkedList which contains Liquids. 

As we know that the “real world” Cocktails are made from different liquids, we have also used the LinkedList with Liquids to build our Cocktails.
Liquids contain different Volume and Alcohol percentage. 

-To calculate the correct Volume and Alcohol percent we have implemented the methods from Drink class and updated it to the current state of Cocktail objects. 

-For the calculation of the Alcohol percentage first we have calculate the pure alcohol percent of all liquids and then divided it through the sum of Volume. The result is multiplied with 100 to get the Alcohol percent in liter.

-To get the correct volume of the Cocktail, we have in getVolume added all volumes of the liquids together and the result multiplied with 100 to get the Volume in liter.

-For both methods we have addtitionaly to it we have implemented the round method, to round the number of decimals for the Volume and Alcohol percent.

-In the addLiquids method are just liquids added to be implemented in the LinkedList.

-We have also used the Constructor and getter for the variable.

-How to correctly build up the “real world” Cocktail is described through the buildRecipe method, where we in value of String describe the steps needed to be done to make the Cocktail taste perfectly.

### Implementation 2 – Shake ###
Class **"Shake"** extends the **"Drink"** class. Shake class represents a Shake which contains 2 fruits and a liquid. 

Usually Shakes do not contain Alcohol percentage, but in this case we have used it for testing purposes. It contains one Liquid, which is water or milk.

-To calculate the correct Volume and Alcohol percent we have implemented the methods from Drink class and updated it to the current state of Cocktail objects. 

-For the calculation of the Alcohol percentage first we have calculate the pure alcohol percent of all liquids and then divided it through the sum of Volume. The result is multiplied with 100 to get the Alcohol percent in liter.

-To get the correct volume of the Cocktail, we have in getVolume added all volumes of the liquids together and the result multiplied with 100 to get the Volume in liter.

-In the addLiquids method we are just adding a liquidi to the linked list, which is required for the Shake

-In the setFruits method we are able to add 2 fruits. If we have more then 2 fruits we will receive an error message.

-In the constructor we declare the list of liquids and the String Array fruits with a size of 2



We added a little code snippet below to show how we tested, if a created non-alcoholic Cocktail virginColada has no alcohol in it.

```java
    void testIfNonAlcoholic() {
        assertFalse(virginColada.isAlcoholic(), "virgin colada should be non-alcoholic!");
    }
```