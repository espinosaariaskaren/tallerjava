/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg3;

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
        Scanner teclado = new Scanner(System.in);
        int edad;
        int categoria;
        double teatro;
        double total = 0;
        double descuento = 0;

        System.out.println("¿cual es su edad?");
        edad = teclado.nextInt();

        if (edad < 5) {
            System.out.println("lo siento no puedes ingresar al teatro.");
        } else {
            do {
                System.out.println("ingrese su categoria:");
                System.out.println("1. 5-14 años (descuento 35%)");
                System.out.println("2. 15-19 años (descuento 25%)");
                System.out.println("3. 20-45 años (descuento 10%)");
                System.out.println("4. 46-65 años (descuento 25%)");
                System.out.println("5. 66 años o mas (descuento 35%)");
                categoria = teclado.nextInt();
                System.out.println("¿cuanto cobra el teatro?");
                teatro = teclado.nextDouble();

                switch (categoria) {
                    case 1:
                        descuento = 0.35;
                        break;
                    case 2:
                        descuento = 0.25;
                        break;
                    case 3:
                        descuento = 0.1;
                        break;
                    case 4:
                        descuento = 0.25;
                        break;
                    case 5:
                        descuento = 0.35;
                        break;
                    default : 
                        System.out.println("categoria invalida");
                        break;
                }
                if (descuento > 0){
                    total= teatro * (1-descuento);
                    System.out.println("su descuento es de $"+ (teatro-total));
                    System.out.println("el total a pagar es de $"+ total);
                }
                System.out.println("¿decea continuar comprando? (si/no)");
            } while (teclado.next().equalsIgnoreCase("s"));
                    }
            teclado. close();
            
                    

                }
            }
        



