package pkg3.pkg12.pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el multiplicando: ");
        int num1 = scan.nextInt();

        System.out.print("Ingrese el multiplicador maximo: ");
        int num2 = scan.nextInt();

        for (int i = 0; i <= num2; i++) {

            System.out.println(num1 + " * " + i + " = " + num1 * i);
        }
        scan.close();
    }
}