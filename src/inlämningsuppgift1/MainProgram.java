package inlämningsuppgift1;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 09:16
 * Project: Sprint1Övnings
 * Copyright: MIT
 *
 *UPPGIFT för Objektorienterad programmering och Java kurs
 *
 * A program that search if an animal is in a pet hotel (searching for its name)
 * and if it is established provides the corresponding diet.
 *
 *Ett program som söker om ett djur befinner sig i ett djurhotell
 *(söker efter dess namn) och om det är etablerat ger motsvarande kost.
 */
public class MainProgram {

    MainProgram() {
        SimDataBase animalList = new SimDataBase();
        Gui gui = new Gui();
        gui.printInput();

        //POLYMORFISM ->alla djur är referenser av Animal typ, men answerMessage() metoden ger olika svar beroende på objektets typ.
        for (Animal a : animalList.getAnimalList()) {
            if (a.getName().equalsIgnoreCase(gui.getInput())) {
                gui.setOutput(a.answerMessage());
                break;
            } else
                gui.setOutput(null);
        }
     
        gui.printOutput();
    }


    public static void main(String[] args) {


        MainProgram t = new MainProgram();

    }

}
