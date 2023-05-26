import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("escribir la cantidad de numeros que desea");

        int cantNum = scan.nextInt();
        int[] numeros = new int[cantNum];

        System.out.println("los numeros pares son los siguientes");

        for (int i = 0; i < cantNum; i++) {
            numeros[i] = i + 1;

            if (numeros[i] % 2 == 0) {

                System.out.println(numeros[i]);
            }
        }
        System.out.println("los numeros impares son los siguientes");
        for (int i = 0; i < cantNum; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
            scan.close();
        }
    }
}