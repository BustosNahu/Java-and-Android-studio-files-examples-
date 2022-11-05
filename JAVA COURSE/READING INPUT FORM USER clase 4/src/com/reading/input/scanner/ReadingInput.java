package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String [] args)
    {
        int firstNumber;
        int secondNumber;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique el primer numero");
        firstNumber = teclado.nextInt();

        System.out.println("Indique el segundo numero");
        secondNumber = teclado.nextInt();

        double promedio = (firstNumber + secondNumber) / 2.0;

        System.out.println("el promedio es " + promedio);

        String name;
        String surname;

        teclado.nextLine();
        System.out.println("Ingrese su nombre ");
        name = teclado.nextLine();

        System.out.println("Ingrese su apellido ");
        surname = teclado.nextLine();


        System.out.printf(name + " " + surname);
    }

}
