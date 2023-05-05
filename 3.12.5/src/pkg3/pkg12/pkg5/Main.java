package pkg3.pkg12.pkg5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int base = scan.nextInt();

        System.out.print("Introduzca el exponente: ");
        int exponente = scan.nextInt();

        int resultado = 1;
        String proceso = "";

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
            proceso += base;
            if (i != exponente) {
                proceso += " * ";
            }
        }

        System.out.println("El proceso es: " + proceso + "   =  " + resultado);
        scan.close();
    }

}
