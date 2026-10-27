import java.util.Scanner;

public class exercici8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] dades = new int[5];

        for (int i = 0; i < dades.length; i++){
            dades[i] = sc.nextInt();
        }

        System.out.println("Quin index vols modificar");
        int index = sc.nextInt();

        while (index < 0 || index >= dades.length){
            System.out.println("Index no valid");
            index = sc.nextInt();
        }
        System.out.println("Introdueix el nou valor");
        int nouValor = sc.nextInt();

        dades[index] = nouValor;

        System.out.println("Array final:");
        for (int i = 0; i < dades.length; i++){
            System.out.println(dades[i]);
        }
    }
}