package Ejercicios;

import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {

        //Varaibles
        int [] aleatorios = new int[30];
        int suma =0;
        double media=0;

        //Programa
        for (int i = 0; i < aleatorios.length; i++){
            //int aleatorio = (int) Math.random()*11;
            aleatorios[i] = (int) (Math.random()*11);
        }


        for ( int item  : aleatorios  ) {
            //suma = suma + item;
            suma +=item;
        }

        media=(double) suma/(double)aleatorios.length;

        System.out.println("La suma es; "+ suma);
        System.out.println("La media es; "+ media);
    }
}
