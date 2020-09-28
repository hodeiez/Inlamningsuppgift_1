package inlämningsuppgift1_v2;

import javax.swing.*;

/**
 * Created by Hodei Eceiza
 * Date: 9/25/2020
 * Time: 10:43
 * Project: Sprint1Övnings
 * Copyright: MIT
 * <p>
 * simple Gui for the user
 */

public class Gui {
    private String input, output;

    /**
     * runs a dialog inside the constructor.
     */
    Gui() {
    }
    public void printInput() {
        input = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        if(input==null)
            System.exit(0);

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Skriva någonting, snälla");
            System.exit(0);
        }
    }
    public void printOutput() {
        JOptionPane.showMessageDialog(null, (output != null) ? output : "Det finns inget djur som heter " + input);
    }

    public void setOutput(String output) {
        this.output = output;
    }
    public String getInput(){
        return input;
    }
    public String getOutput() {
        return output;
    }
}
