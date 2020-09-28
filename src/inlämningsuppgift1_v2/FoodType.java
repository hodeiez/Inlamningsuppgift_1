package inlämningsuppgift1_v2;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:15
 * Project: Sprint1Övnings
 * Copyright: MIT
 */

/**
 * Enum class with a list of constants of animals food type and their portions quantity depending on animal type.
 */
public enum FoodType {
    DOG(100, "hundfoder"),
    CAT(150, "kattfoder"),
    SNAKE(20, "ormpellets");

    protected int foodQ;
    protected String foodType;


    /**
     *  setting food type, quantity and unit
     * @param foodQ portion quantity
     * @param foodType type of food
     */
    FoodType(int foodQ, String foodType) {
        this.foodQ = foodQ;
        this.foodType = foodType;
    }
}
