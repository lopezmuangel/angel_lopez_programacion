package Ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        //Variables
        int[] numeros =new int[10];
        Scanner lecturaTeclado =new Scanner(System.in);

        //Programa
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce número a guardar");
            int numero = lecturaTeclado.nextInt();
            numeros[i]=numero;

        }

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%d : %d%n", i, numeros[i]);
        }
    }
}
