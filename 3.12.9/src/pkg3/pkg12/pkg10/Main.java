
package pkg3.pkg12.pkg10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A1, A2, MCM = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print(" INGRESE UN NUMERO ");
        A1 = sc.nextInt();
        System.out.print("INGRESE OTRO NUMERO");
        A2 = sc.nextInt();
        int min = Math.min(A1, A2);

        for (int i = 1; i < min; i++) {
            if (A1 % i == 0 && A2 % i == 0) {
                int mcd = i;

                MCM = (A1 * A2) / mcd;
            }
        }
        if (A2 % 2 != 0) {
            System.out.println("MAXIMO COMUN MULTIPLO DE " + A1 + "  Y  " + A2 + " = " + MCM);
        } else {
            System.out.println("el segundo numero no es impar");
        }
        sc.close();
    }

}