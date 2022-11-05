package com.example.decision;

import javax.swing.*;

public class TheSwitchStatement {

    public static void main(String[] args)
    {
        int number;

        String input = JOptionPane.showInputDialog("Porfavor ingrese 1, 2 o 3");
        number = Integer.parseInt(input);

        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"Ingresaste el numero 1");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Ingresaste el numero 2");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Ingresaste el numero 3");
                break;

            //utilizado para casos cuando no es ninguno de los case anteriores
            default:
                JOptionPane.showMessageDialog(null, "No ingresaste 1,2 o 3");
        }

        char letter;

        input = JOptionPane.showInputDialog("Porfavr ingrese a, b or c ");
        letter = input.charAt(0);

        switch (letter)
        {
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null, "Ingresaste la letra a");
                break;

            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null, "Ingresaste la letra b");
                break;

            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null, "Ingresaste la letra c");
                break;

            default:
                JOptionPane.showMessageDialog(null, "No ingresaste ninguna de la opciones");
        }

        System.exit(0);

    }

}
