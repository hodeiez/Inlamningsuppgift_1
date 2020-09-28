package inlämningsuppgift1;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:03
 * Project: Sprint1Övnings
 * Copyright: MIT
 */
public class Dog extends Animal implements ICalculateDiet {
    private String food;
    private double foodQuantity;
    private String foodUnit;

    protected Dog(String name,double weight){
        super(name, weight);
        this.food=FoodType.DOG.foodType;
        this.foodQuantity=calculateWeightByGrams();
        this.foodUnit=FoodUnits.GR.unit;
    }

    @Override
    public double calculateWeightByGrams() {
        return getWeight()*1000/ FoodType.DOG.foodQ;
    }

    public String answerMessage() {
        return String.format("%s ska få %.2f %s. %s", getName(), this.foodQuantity, this.foodUnit,this.food);
    }
}
