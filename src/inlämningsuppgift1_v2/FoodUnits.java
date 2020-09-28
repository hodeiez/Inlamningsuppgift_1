package inlämningsuppgift1_v2;

/**
 * Created by Hodei Eceiza
 * Date: 9/26/2020
 * Time: 12:51
 * Project: Sprint1Övnings
 * Copyright: MIT
 */

/**
 * values of measure units, can grow in the future(liters,pieces,...)
 */
public enum FoodUnits {
    GR("gr"),PELLETS("pellets");
    protected String unit;
    FoodUnits(String unit){
        this.unit=unit;
    }
}
