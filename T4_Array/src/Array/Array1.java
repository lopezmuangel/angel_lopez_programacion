package Array;

public class Array1 {
    public static void main(String[] args) {
        //array de numeros
        int[] numeros = new int [10];
        boolean[] aciertos = new boolean[5];
        String[] palabras =new String[3];
        double[] decimales = new double[2];
        int[] numerosDos = {1,2,3,4,5,6,7,8,9,10};
        int longitudArray = numerosDos.length;
        System.out.println(longitudArray);
        for(int i = 0; i <= numerosDos.length; i++){
            System.out.println(numerosDos[i]);
        }
    }
}
