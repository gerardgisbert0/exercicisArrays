import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int[] dades = new int[6];
                for (int i = 0; i < dades.length; i++) {
                    dades[i] = sc.nextInt();
                }

                System.out.println("Recorregut invers:");

                for (int i = dades.length - 1; i >= 0; i--) {
                    System.out.println(dades[i]);
                }

                System.out.println("Recorregut original:");
                for (int i = 0; i < dades.length; i++) {
                    System.out.println(dades[i]);
                }
            }
        }

