package pkg3.pkg12.pkg1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int n = scan.nextInt();
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = num + i;
            System.out.println(num);

        }
        scan.close();

    }

}
