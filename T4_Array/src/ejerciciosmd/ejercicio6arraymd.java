package ejerciciosmd;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class ejercicio6arraymd {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int ultimo = numeros[numeros.length - 1];
        int primero = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = primero;
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;
        for (int item : numeros) {
            System.out.print(item + " ");
        }

    }
}
