import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = new String();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arreglo = new int[100];
        int aux = 0;
        boolean sorted = false;
        cadena = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != '+' && cadena.charAt(i) != '0') {
                list.add(Integer.parseInt(String.valueOf(cadena.charAt(i))));
                contador++;

            }
        }
        int numeros[] = new int[contador];

        for (int i = 0; i < contador; i++) {
            numeros[i] = list.get(i);
        }
        while (!sorted) {
            for (int i = 0; i < numeros.length - 1; i++) {

                sorted = true;
                if (numeros[i] > numeros[i + 1]) {
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i == 0 || i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print("+" + numeros[i] + "+");
            }
        }

    }
}
