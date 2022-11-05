package com.example.calculations;

import javax.swing.*;

public class SentinelValues {

    public static void main (String [] args)
    {
        int value;
        int doubleValue;

        String input = JOptionPane.showInputDialog("Porfavor ingrese un numero para duplicar" +
                "(0 para parar)");

        value = Integer.parseInt(input);

        while (value != 0 )
        {
            doubleValue = value * 2;

            JOptionPane.showMessageDialog(null,
                    "" + value + " el doble es " + doubleValue);

            input = JOptionPane.showInputDialog("Porfavor ingrese un numero para duplicar" +
                    "(0 para parar)");

            value = Integer.parseInt(input);

        }
        System.exit(0);

    }

}
