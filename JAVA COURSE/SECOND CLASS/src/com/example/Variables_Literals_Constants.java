package com.example;

public class Variables_Literals_Constants
{
    public static void main(String[] args)
    {
        //final es para indicar constantes
        final int FIRS_NUMBER;
        int secondNumber;

        FIRS_NUMBER = 18;
        secondNumber = 18;

        double average;

        average = (double) (FIRS_NUMBER + secondNumber) / 2;

        System.out.println("I have " + average + " years old");

        String name;
        String surname;

        name = "Nahu";
        surname = "Bustos";

        System.out.println("My name is " + name + " " + surname);

        boolean value;
        value = true;
        System.out.println("I was one of the boanerenses gold winners, wasn't me? " + value);


        char letter;
        letter = 'W';
        System.out.println(letter);



    }

}
