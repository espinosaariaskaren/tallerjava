import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int limite;
        System.out.println("ingrese un numero");
        limite = leer.nextInt();
        int[] numeros = new int[limite];
        for (int i = 1; i < limite; i++) {
            numeros[i] = i;
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(numeros[i]);
        }
        leer.close();
    }
}