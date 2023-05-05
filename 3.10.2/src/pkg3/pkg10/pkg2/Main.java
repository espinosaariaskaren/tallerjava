/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg2;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        double total =0;
        String respuesta;
        
        do{
            System.out.println("ingrese en precio del articulo");
            double precio=scan.nextDouble();
            System.out.println("ingrese la cantidas de articulos iguales que ha tomado:");
            int cantidad= scan.nextInt();
            double subtotal= precio*cantidad;
            total+= subtotal;
            
            System.out.println("desea seguir comprando (si/no):");
            respuesta =scan.next();
        }while (respuesta.equals("salir"));
        
        System.out.println("el total de la compra es: $"+ total);
        }
    }
    

