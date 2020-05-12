package at.fhj.iit;

public class ShakeNutritionTable {
    private String name;
    private String cal;
    private String carbs;
    private String fat;
    private String protein;

    //default constructor
    public ShakeNutritionTable() { }

    //constructor


    public ShakeNutritionTable(String name, String cal, String carbs, String fat, String protein) {
        this.name = name;
        this.cal = cal;
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        return name + " has " + cal + " , " + carbs + " of carbs , " + fat + " of fat , " + protein + " of proteins \n";
    }

}
