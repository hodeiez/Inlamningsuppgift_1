package inlämningsuppgift1_v2;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:01
 * Project: Sprint1Övnings
 * Copyright: MIT
 */
//INKAPSLING->Variablerna är privat och man måste använda getters/setters för att få tillgång för dem.
public class Animal {
    private double weight;
    private String name;
    private String food;
    private double foodQuantity;


    public Animal(String name, double weight) {
        this.weight = weight;
        this.name = name;
    }
//getters and setters
    protected double getWeight() { return this.weight; }

    protected String getName() { return this.name; }

    protected void setFood(String food) {
        this.food = food;
    }

    protected String getFood() { return food; }

    protected void setFoodQuantity(double foodQuantity) { this.foodQuantity = foodQuantity; }

    protected double getFoodQuantity() { return foodQuantity; }

    /**
     * text telling the quantity and type of food of the animal.
     * @return string with animal name,food quantity and type of food.
     */
    public String answerMessage() {
        return String.format("%s ska få %.2f %s. %s", this.name, this.foodQuantity,FoodUnits.GR,this.food);
    }
}