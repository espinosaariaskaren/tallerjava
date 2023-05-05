/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg1;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int descuento;
        double total;
        String bolita;       
    do  {
        System.out.println("bienvenido a la tienda donde tendra su descuento");
        System.out.println("ingrese el color de su bolita(roja, amarillo o blanca):");
        bolita=teclado.nextLine();
        switch(bolita){
            case "roja":
              descuento = 40;
              break;
              case "amarillo":
              descuento = 25;
              break;
              case "blanca":
              descuento = 0;
              break;
              default :
                  descuento = 0;
                  System.out.println("color de la bola invalido");
        }
        if (descuento>0){
            System.out.println("ingrese el total de su compra:");
        total=teclado.nextDouble();
        double descuentoAplicado= total * descuento/100;
        double totalpagar=total- descuentoAplicado;
            System.out.println("el descuento es:"+ descuentoAplicado);
            System.out.println("el total de pagar es:"+ totalpagar);
        }
        teclado.nextLine();
        System.out.println("presione ´n´ para seguir comprando o otra cualquier tecla para salir");
    }while (teclado.nextLine().equalsIgnoreCase("n"));
        System.out.println("graciar por su compra");
    
            
    
    }
    
}
