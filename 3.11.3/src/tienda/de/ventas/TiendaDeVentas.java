/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda.de.ventas;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class TiendaDeVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numClientes = 0;
        double totalVentas = 0;

        // Pedir monto de compra de cada cliente
        while (true) {
            System.out.print("Ingrese el monto de la compra del cliente (o 0 para terminar): ");
            double monto = scan.nextDouble();

            // Salir del bucle si el monto es 0
            if (monto == 0) {
                break;
            }

            // Sumar el monto al total de ventas y aumentar el contador de clientes
            totalVentas += monto;
            numClientes++;
        }

        // Mostrar el total de ventas y el número de clientes atendidos
        System.out.println("Cantidad total de ventas: $" + totalVentas);
        System.out.println("Número de clientes atendidos: " + numClientes);
    }
}
