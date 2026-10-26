
import java.util.Scanner;

public class exercici3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dades = new int[5];
        int suma = 0;
        double mitjana;

        for (int i = 0; i < dades.length; i++) {
            dades[i] = sc.nextInt();
        }

        for (int i = 0; i < dades.length; i++) {
            suma = suma + dades[i];
        }

        mitjana = (double) suma / dades.length;

        System.out.println("Suma: " + suma);
        System.out.println("Mitjana: " + mitjana);
    }
}


