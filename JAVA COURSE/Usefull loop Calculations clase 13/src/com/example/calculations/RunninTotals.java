package com.example.calculations;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunninTotals {

    public static void main (String [] args) {
        int days;
        double sales;
        double totalSales = 0.0;

        /*DECIMAL FORMAT es el mejor formato para mostrar cantidades de numero, el # sirve
         para mostrarlos en caso de que hubiera alguno en su posicion*/
        DecimalFormat dollar = new DecimalFormat("###,###,##0.00");

        String input = JOptionPane.showInputDialog("Por cuantos dias tuviste ventas");

        days = Integer.parseInt(input);

        for (int count = 1; count <= days; count++)
        {
            input = JOptionPane.showInputDialog("Ingrese las ventas del dia" + count);

            sales = Double.parseDouble(input);

            totalSales = totalSales + sales;
        }

        JOptionPane.showMessageDialog(null,
                "El total de las ventas son: $" + dollar.format(totalSales));

        System.exit(0);

    }

}
