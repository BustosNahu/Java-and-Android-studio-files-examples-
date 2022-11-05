package com.example.conditionals;

import javax.swing.*;

public class conditionals {

    public static void main (String[] args) {

        int number;

        String input;
        input = JOptionPane.showInputDialog("Porfavor ingrese un numero");
        number = Integer.parseInt(input);

        /*
        if (number == 5) {
            JOptionPane.showMessageDialog(null, "El numero es exactamente 5");
        } else if (number > 10) {
            JOptionPane.showMessageDialog(null, "El numero es mayor a 10");
        } else if (number > 5) {
            JOptionPane.showMessageDialog(null, "El numero es menor a 10");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es menor a 5");
        }
        */

        if (number < 50 && number >= 45)
        {
            JOptionPane.showMessageDialog(null,"Fallaste");
        }
        else //el usuario pasa
        {
            if (number >= 75){
                JOptionPane.showMessageDialog(null, "Tienes una destincion");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Pasaste");
            }
        }
        System.exit(    0);
    }
}
