package inlämningsuppgift1_v2;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:03
 * Project: Sprint1Övnings
 * Copyright: MIT
 */
public class Cat extends Animal implements ICalculateDiet {

    protected Cat(String name, double weight) {
        super(name, weight);
        super.setFood(FoodType.CAT.foodType);
        super.setFoodQuantity(this.calculateGrams());
    }

    @Override
    public double calculateGrams() { return getWeight() * 1000 / FoodType.CAT.foodQ; }

}
