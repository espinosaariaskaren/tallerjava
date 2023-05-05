/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg4;
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
        Scanner scan=new Scanner (System.in);
        int numVehiculos= 0;
        double masaTotal = 0;
        boolean salir;
        do{
            System.out.println("ingrese los datos del vehiculo:");
            System.out.println("presion: ");
            double presion= scan.nextDouble();
            System.out.println("volumen:");
            double volumen = scan.nextDouble();
            System.out.println("temperatura:");
            double temperatura = scan.nextDouble();
            System.out.println("tipo de vehiculo (1: motocicleta, 2: automovil):");
            int tipoVehiculo = scan.nextInt();
            
            double masaAire = presion * volumen / (0.37 * (temperatura + 460));
            
            if (tipoVehiculo==1){
                masaAire*= 0.8;
            }
            masaTotal += masaAire;
            numVehiculos++;
            
            System.out.println("¿desea ingresar otro vehiculo? (si/no):");
            String respuesta =scan.next();
            salir = respuesta.equalsIgnoreCase("n");
        }while (salir);
            }
        }
    
    

