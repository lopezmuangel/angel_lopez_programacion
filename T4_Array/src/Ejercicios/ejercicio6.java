package Ejercicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        //Variables
        int[] aleatorios = new int[20];
        int sumaModificaciones = 0;

        //Programa


        //rellenar
        for (int i = 0; i < aleatorios.length; i++) {
            //int aleatorio = (int) Math.random()*11;
            aleatorios[i] = (int) (Math.random() * 31);
        }

        //evaluar
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] == 6) {
                aleatorios[i] = 8;
                sumaModificaciones++;
            } else if (aleatorios[i] == 7) {
                aleatorios[i] = 15;
                sumaModificaciones++;
            } else if (aleatorios[i] == 28) {
                aleatorios[i] = 10;
                sumaModificaciones++;
            }
        }
        System.out.printf("El numero de modificaciones es: %d%n", sumaModificaciones);
    }
}
