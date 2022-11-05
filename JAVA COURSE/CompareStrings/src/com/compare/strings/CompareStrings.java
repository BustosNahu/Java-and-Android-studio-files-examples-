package com.compare.strings;

import javax.swing.*;

public class CompareStrings {

    public static void main (String [] args)
    {
        String nombre1 = JOptionPane.showInputDialog("Porfavor ingrese el nombre 1: ");
        String nombre2 = JOptionPane.showInputDialog("Porfavor ingrese el nombre 2: ");

        if (nombre1.equals(nombre2))
        {
            System.out.println("Los nombres ingresados son iguales");
        }
        if (nombre1.compareTo(nombre2) < 0)
        {
            System.out.println("El nombre 1 esta primero en el alfabeto");
        }

        if (nombre1.compareTo(nombre2) > 0)
        {
            System.out.println("El nombre 2 esta primero en el alfabeto");
        }
        System.exit(0);

    }
}
