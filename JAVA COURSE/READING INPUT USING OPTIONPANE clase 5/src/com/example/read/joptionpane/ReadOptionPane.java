package com.example.read.joptionpane;

import javax.swing.*;

public class ReadOptionPane {

    public static void main(String [] args)
    {
        String nombre;
        String apellido;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        apellido = JOptionPane.showInputDialog("Ingrese su apellido");

        JOptionPane.showMessageDialog(null, nombre + " " + apellido);

         int firstNumber;
         int secondNumber;
         String input;

        input = JOptionPane.showInputDialog("Ingrese el primer numero");
        firstNumber = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Ingrese el segundo numero");
        secondNumber = Integer.parseInt(input);

        double average;1

        average = (firstNumber + secondNumber);
        JOptionPane.showMessageDialog(null,average);

    }


}
