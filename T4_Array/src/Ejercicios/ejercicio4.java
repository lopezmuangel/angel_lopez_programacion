package Ejercicios;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        //Variables
        int numero[] = new int[20];
        int cubo[] = new int[20];
        int cuadrado[]= new int [20];

        //Programa
        for(int i = 0; i< numero.length; i++){
            numero[i] =(int) (Math.random()*101);
        }
        //Relleno el cuadrado
        for (int i = 0;i < numero.length ; i++){
            cuadrado[i] = (int) Math.pow(numero[i],2);
        }

        //Relleno el cubo
        for (int i = 0; i < numero.length ; i++) {
            cubo[i] = (int) Math.pow(numero[i],3);
        }

        // sacar en columnas

        for (int i = 0; i < numero.length; i++) {

            System.out.printf("%d \t %d \t %d%n",numero[i],cuadrado[i],cubo[i]);

        }

    }
}

