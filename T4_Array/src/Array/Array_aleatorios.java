package Array;

public class Array_aleatorios {

    public static void main(String[] args) {
        //Variables
        int[] numeros = new int[10];
        boolean[] aciertos = new boolean[5];
        String[] palabras = new String[3];
        double[] decimales = new double[2];
        int[] numerosDos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int longitudArray = numerosDos.length;
        int aleatorio = (int) (Math.random() * 51);
        int numerosPares= 0, numerosImpares = 0;
        //Programa
        for (int i = 0; i < numerosDos.length; i++) {
            aleatorio = (int) (Math.random() * 51);
            numerosDos[i] = aleatorio;

        }
        System.out.println("Estos son los 15 números aleatorios");

        for (int j = 0; j < numerosDos.length; j++) {
            System.out.println(numerosDos[j]);
            if ( numerosDos[j] % 2 == 0){
                numerosPares++;
                System.out.println("Es par");
            }else{
                numerosImpares++;
                System.out.println("Es impar");
            }
        }
    System.out.println("Habrá un total de " + numerosPares + " de números pares y " + numerosImpares + " números impares");
    }
}
