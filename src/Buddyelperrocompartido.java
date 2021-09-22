import java.util.ArrayList;
import java.util.Scanner;

public class Buddyelperrocompartido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> porciones = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                porciones.add(i);
            }
        }
        for (int i = 0; i < porciones.size(); i++) {
            if (i == 0) {
                System.out.print(porciones.get(i));
            } else {
                System.out.print(" " + porciones.get(i));
            } // test
        }
    }
}
