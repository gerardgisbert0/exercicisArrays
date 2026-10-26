import java.util.Scanner;

public class exercici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dades = new int[8];
        int valor;
        int posicio = -1;

        for (int i = 0; i < dades.length; i++) {
            dades[i] = sc.nextInt();
        }

        valor = sc.nextInt();

        for (int i = 0; i < dades.length; i++) {
            if (dades[i] == valor && posicio == -1) {
                posicio = i;
            }
        }

        if (posicio != -1) {
            System.out.println("Index: " + posicio);
        } else {
            System.out.println("No trobat");
        }
    }
}
