/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg6;
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
        int nGallinas=0;
        double peso,altura, huevos, calidad, promCalidad=0, precioKilo;
        do{
            System.out.println("ingrese el peso de la gallina en kilogramos:");
            peso = scan.nextDouble();
            
            System.out.println("ingrese la altura de la gallina en centimetros;");
            altura=scan.nextDouble();
            
            System.out.println("ingrese el numero de huevos que pone la gallina");
            huevos=scan.nextDouble();
            
            calidad=(peso*altura)/ huevos;
            promCalidad += calidad;
            nGallinas++;
            
            System.out.println("¿decea ingresar los datos de otra gallina? (s/n):");
        }while (scan.next().equalsIgnoreCase("s"));
        
        promCalidad/= nGallinas;
        if (promCalidad>=15){
            precioKilo=1.2*promCalidad;
        }else if (promCalidad>8){
            precioKilo=1.0* promCalidad;
        }else {
                    precioKilo=0.8* promCalidad;
        }
        System.out.println("/nPromedio de calidad de las gallinas:"+ promCalidad);
        System.out.println("precio por kilo de huevo: $"+ precioKilo);
    }
        }
    
    

