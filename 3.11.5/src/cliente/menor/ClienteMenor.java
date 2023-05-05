/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente.menor;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class ClienteMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                         Scanner sc = new Scanner(System.in);
        double totalVentas = 0;
        int totalClientes = 0;

        // Pedir monto de venta de cada cliente
        while (true) {
            System.out.print("Ingrese el monto de la venta del cliente (o 0 para terminar): ");
            double monto = sc.nextDouble();

            // Salir del bucle si el monto es 0
            if (monto == 0) {
                break;
            }

            // Calcular el total de la venta
            totalVentas += monto;

            // Leer la cantidad con la que paga el cliente
            double cantidadPago;
            do {
                System.out.print("Ingrese la cantidad con la que paga el cliente: ");
                cantidadPago = sc.nextDouble();

                if (cantidadPago < monto) {
                    System.out.println("La cantidad de pago es menor que el monto a pagar. Intente de nuevo.");
                }
            } while (cantidadPago < monto);

            // Calcular el cambio y mostrarlo
            double cambio = cantidadPago - monto;
            System.out.printf("Cambio: $%.2f\n", cambio);

            // Incrementar el contador de clientes
            totalClientes++;
        }

        // Imprimir el resumen de ventas al final del día
        System.out.println("Resumen de ventas:");
        System.out.printf("Total de ventas: $%.2f\n", totalVentas);
        System.out.printf("Número de clientes atendidos: %d\n", totalClientes);
    }
}
    
    

