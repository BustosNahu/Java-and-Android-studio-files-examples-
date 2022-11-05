package com.example.calculations;

import javax.swing.*;

public class InputValidation {

    public static void main (String [] args)
    {
        String input = JOptionPane.showInputDialog(
                "Porfavor ingrese un numero entre 1 y 100");
        int number = Integer.parseInt(input);

        while (number < 1 || number > 100)
        {
            JOptionPane.showMessageDialog(null,
                    "El numero no es valido");
            number = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null,"Correcto");

    }

}
