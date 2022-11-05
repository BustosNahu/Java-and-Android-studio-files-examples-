package com.example.calculations;

import javax.swing.*;

public class UserControlledLoop {

    public static void main (String [] args)
    {

        int maxvalue;

        String input = JOptionPane.showInputDialog("Que tan alto puedo tirar el numero");

        maxvalue = Integer.parseInt(input);

        System.out.println("Number          Number squared");
        System.out.println("-------------------------------");

        for(int number = 1; number <= maxvalue; number ++)
        {
            System.out.println(number + "\t\t\t\t" + number*number);
        }

    }

}
