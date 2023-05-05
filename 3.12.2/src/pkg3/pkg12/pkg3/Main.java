package pkg3.pkg12.pkg3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        System.out.println("escribir dos numeros");
        a = scan.nextInt();
        b = scan.nextInt();
        c = a;

        for (int i = 1; i < b; i++) {

            System.out.println(a + "+" + c);
            a = a + c;
        }
        System.out.println("el producto de los dos numeros es: " + a);

        scan.close();

    }
}
