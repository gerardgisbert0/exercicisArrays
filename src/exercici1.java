import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dades [] = new int[5];

        for(int i = 0; i < dades.length; i++){
            dades[i] = sc.nextInt();
        }
        for (int i = 0; i < dades.length; i++){
            System.out.println(i + ":" + dades[i]);
        }
        System.out.println("Longitud" + dades.length);
        System.out.println("Primer valor:" + dades[0]);
        System.out.println("Ultim valor" + dades[dades.length - 1]);
    }
}
