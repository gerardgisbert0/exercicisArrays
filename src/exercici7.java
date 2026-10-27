
import java.util.Scanner;

public class exercici7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dades = new int[8];
        int comptador = 0;

        for (int i = 0; i < dades.length; i++) {
            dades[i] = sc.nextInt();
        }
        int valor = sc.nextInt();
        for (int i = 0; i < dades.length; i++) {
            if (dades[i] == valor) {
                comptador++;
                System.out.println("Index: " + i);
            }
        }
        if (comptador == 0) {
            System.out.println("Cap coincidència");
        }
        System.out.println("Total: " + comptador);
    }
}

