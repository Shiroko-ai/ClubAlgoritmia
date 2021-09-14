import java.util.Scanner;

public class EjercicioAsencillo {

    public static void main(String[] args) {
        String cadena = new String();
        Scanner sc = new Scanner(System.in);
        String subtotal = new String();
        int total = 0;
        int exponente = 0;
        cadena = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                if (Integer.parseInt(subtotal.toString()) < 0 || Integer.parseInt(subtotal.toString()) > 1000) {

                } else {
                    total += Integer.parseInt(subtotal.toString());
                    subtotal = "";
                }
            } else if (i == cadena.length() - 1) {
                if (Integer.parseInt(subtotal.toString()) < 0 || Integer.parseInt(subtotal.toString()) > 1000) {

                } else {
                    subtotal = subtotal + cadena.charAt(i);
                    total += Integer.parseInt(subtotal.toString());
                    subtotal = "";
                }
            } else {
                subtotal = subtotal + cadena.charAt(i);
            }
        }
        int cantidad_descuento = total;
        while (cantidad_descuento > 500) {
            total = total - 100;
            cantidad_descuento = cantidad_descuento - 500;
        }
        System.out.println(total);
    }
}
