package com.example.decisionStructure;

import javax.swing.*;

public class DecisionStructure {

    public void main (String[] args)
    {

        int number;

        String input;
        input = JOptionPane.showInputDialog("Porfavor ingrese un numero");
        number = Integer.parseInt(input);


        if (number == 5)
        {
                JOptionPane.showMessageDialog(null, "El numero es exactamente 5" );
        }
        if (number > 5)
        {
            JOptionPane.showMessageDialog(null,"El numero es mayor a 5");
        }

        if (number < 10)
        {
            JOptionPane.showMessageDialog(null, "El numero es menor a 10");
        }

    }

}
