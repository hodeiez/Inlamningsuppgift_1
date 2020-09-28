package inlämningsuppgift1;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:01
 * Project: Sprint1Övnings
 * Copyright: MIT
 * <p>
 * Superclass representing an Animal, with a name and weight.
 */
//INKAPSLING -->weight och name är privat. Och subklasser Cat,Dog och Snake anropar getters för att ta värdena.
public abstract class Animal {
    private double weight;
    private String name;

    public Animal(String name, double weight) {
        this.weight = weight;
        this.name = name;
    }

    //getters
    protected double getWeight() {
        return this.weight;
    }

    protected String getName() {
        return this.name;
    }

    /**
     * Method to return a text with animals name and its food quantity.
     */
    abstract String answerMessage();
}