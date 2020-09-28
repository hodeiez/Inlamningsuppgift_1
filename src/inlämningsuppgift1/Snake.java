package inlämningsuppgift1;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:03
 * Project: Sprint1Övnings
 * Copyright: MIT
 */
public class Snake extends Animal {
    private String food;
    private double foodQuantity;
    private String foodUnit;

    protected Snake(String name,double weight){
        super(name, weight);
        this.food=FoodType.SNAKE.foodType;
        this.foodQuantity=FoodType.SNAKE.foodQ;
        this.foodUnit=FoodUnits.PELLETS.unit;}


    @Override
    public String answerMessage(){ return String.format("%s ska få %.0f %s",getName(),this.foodQuantity,this.foodUnit); }

}
