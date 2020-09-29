package inlämningsuppgift1_v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 11:47
 * Project: Sprint1Övnings
 * Copyright: MIT
 *
 * Simulated database, useful for testing.
 */


public class SimDataBase {
    public List<Animal> animals;
    public SimDataBase() {
        Animal venus = new Cat("Venus", 5);
        Animal ove = new Cat("Ove", 3);
        Animal hypno = new Snake("Hypno", 1);
        Animal sixteen = new Dog("Sixteen", 5);
        Animal dogge = new Dog("Dogge", 10);

        List<Animal> animalList= new ArrayList<Animal>();
        animalList.add(venus);
        animalList.add(ove);
        animalList.add(hypno);
        animalList.add(sixteen);
        animalList.add(dogge);

        this.animals=animalList;
    }

    public List<Animal> getAnimalList(){
        return animals;
    }
}
