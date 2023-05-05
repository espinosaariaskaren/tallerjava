/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientes;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class Clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        double totalVentas = 0;
        double totalIVA = 0;
        double totalAPagar = 0;
        double totalRecibido = 0;
        double totalCambio = 0;

        // Pedir monto de venta de cada cliente
        while (true) {
            System.out.print("Ingrese el monto de la venta del cliente (o 0 para terminar): ");
            double monto = sc.nextDouble();

            // Salir del bucle si el monto es 0
            if (monto == 0) {
                break;
            }

            // Calcular el IVA y el total a pagar
            double iva = monto * 0.16;
            double total = monto + iva;
            System.out.printf("IVA: $%.2f\n", iva);
            System.out.printf("Total a pagar: $%.2f\n", total);

            // Leer cantidad recibida y calcular el cambio
            System.out.print("Ingrese la cantidad recibida del cliente: ");
            double recibido = sc.nextDouble();
            double cambio = recibido - total;
            System.out.printf("Cambio: $%.2f\n", cambio);

            // Sumar los montos a las variables totales
            totalVentas += monto;
            totalIVA += iva;
            totalAPagar += total;
            totalRecibido += recibido;
            totalCambio += cambio;
        }

        // Imprimir el resumen de ventas al final del día
        System.out.println("Resumen de ventas:");
        System.out.printf("Total de ventas: $%.2f\n", totalVentas);
        System.out.printf("Total de IVA: $%.2f\n", totalIVA);
        System.out.printf("Total a pagar: $%.2f\n", totalAPagar);
        System.out.printf("Total recibido: $%.2f\n", totalRecibido);
        System.out.printf("Total de cambio: $%.2f\n", totalCambio);
    }
}
    
    

