package inlämningsuppgift1_v2;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:03
 * Project: Sprint1Övnings
 * Copyright: MIT
 */
public class Snake extends Animal {
    protected Snake(String name,double weight){
        super(name, weight);
        super.setFood(FoodType.SNAKE.foodType);
        super.setFoodQuantity(FoodType.SNAKE.foodQ);}


    @Override
    public String answerMessage(){ return String.format("%s ska få %.0f %s",this.getName(),this.getFoodQuantity(),this.getFood()); }

}
