/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cantidadalumnos;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class Cantidadalumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        double c1,c2,c3,c4,c5,promedio;
        int nivelan=0,nestudiantes=0;
        while (nestudiantes!=40){
            nestudiantes++;
            
         System.out.println("ingrese las calificaciones de las 5 unidades del alumno"+nestudiantes);
         c1=scan.nextDouble();
         c2=scan.nextDouble();
         c3=scan.nextDouble();
         c4=scan.nextDouble();
         c5=scan.nextDouble();
         promedio=(c1+c2+c3+c4+c5)/5;
          System.out.println("el promedio del estudiante "+nestudiantes+"es de: "+promedio);
          if (promedio<3.0 & promedio>=2.5)  {
        nivelan++;
         }
        }
          System.out.println("el total de estudiantes que nivelan es de :"+nivelan);
    }
    }
    
    
    

