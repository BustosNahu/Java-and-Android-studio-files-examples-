package com.example.loops;

public class Loops {

    public static void main(String[] args)
    {
        //while loop

        int x = 0; //variable para poder controlar con el while loop

        while (x < 5)
        {
            System.out.println("hola mundo");
            x = x + 1; //x++
        }

        System.out.println("");

        //do-while loop

        int y = 0; //variable para poder controlar con el while loop

        //la diferencia con el anterior es que este se ejecuta 1 o mas veces, y el while loop se ejecuta 0 o mas veces.////
        do {
            System.out.println("hola mundo");
            y++;

        }while(y < 5);

        System.out.println("");

        //the for loop
        /*la diferencia de este con los anteriores es que este no necesitas declarar variable a controlar
        antes del mismo, como en el primer while loop, aca se hace todo directo
        */
        for (int i = 0; i < 5; i++)
        {
            System.out.println("hola");
        }


    }
}
