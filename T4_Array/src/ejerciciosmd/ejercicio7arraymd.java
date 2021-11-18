package ejerciciosmd;

import java.util.Scanner;

public class ejercicio7arraymd {
    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        String[] palabras = new String[10];
        int opcion;
        int sumaLetras = 0;
        int opcion;
        System.out.println("1. ver palabras");
        System.out.println("2. Obtener aleatorios");
        System.out.println("3.Ver numero letras");
        System.out.println("4.Ver media palabras");
        System.out.println("5. Ver palabra más grande");
        System.out.println("6. Ver palabra más pequeña");

        switch (opcion){
            case 1:
                System.out.println("Vas a mostrar palabras");
                for ( String item : palabras ) {
                    System.out.println(item);
                }
                break;
            case 2:
                System.out.println("Vas obtener una palabra aleatoria");
                //10 posiciones -> 0 - 9
                int aleatorio = (int) (Math.random()*10);
                System.out.println("La palabra aleatoria es: "+palabras[aleatorio]);
                break;
            case 3:
                sumaLetras =0;
                for ( String item: palabras){
                    sumaLetras +=item.length();
                }
                System.out.println("El número total de letras es:"+sumaLetras);

                break;
            case 4:
                if (sumaLetras == 0){
                    System.out.println("El numero de letras es 0, posiblemente no las has contado");
                }else{
                    System.out.println("El numero media de letras " + sumaLetras);
                }
                break;
            case 5|6:

                String pequenia, grande="";

                for (String item: palabras){
                    if (item.length()>grande.length()){
                        grande =item;
                    }
                    if (item.length()<pequenia.length()){
                        pequenia = item;
                    }
                }
        }
    }
}
