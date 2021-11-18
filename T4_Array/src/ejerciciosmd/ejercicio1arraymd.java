package ejerciciosmd;

import java.util.Scanner;

public class ejercicio1arraymd {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroInto=0;
        double media =0, suma = 0;
        int[] numeros =new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Poe favor introduce un número");
            numeroInto = lecturaTeclado.nextInt();
            numeros[i] = numeroInto;
        }
        for (int item : numeros ){
            suma+= item;
        }
        System.out.println("la suma de los numeros es "+suma);
        System.out.println("la media de los numeros es "+(double)suma/(double) numeros.length);
    }
}
