
import java.util.Scanner;

public class exercici5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dades = new int[7];

        for (int i = 0; i < dades.length; i++) {
            dades[i] = sc.nextInt();
        }

        int maxim = dades[0];
        int minim = dades[0];
        int posMax = 0;
        int posMin = 0;

        for (int i = 1; i < dades.length; i++) {
            if (dades[i] > maxim) {
                maxim = dades[i];
                posMax = i;
            }

            if (dades[i] < minim) {
                minim = dades[i];
                posMin = i;
            }
        }

        System.out.println("Maxim: " + maxim);
        System.out.println("Index maxim: " + posMax);
        System.out.println("Minim: " + minim);
        System.out.println("Index minim: " + posMin);

    }
}

