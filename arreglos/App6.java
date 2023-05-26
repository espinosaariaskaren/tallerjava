import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("escribir la cantidad de numeros que desea");
        int cantNum = scan.nextInt();
        int[] numeros = new int[cantNum];

        for (int i = 0; i < cantNum; i++) {
            numeros[i] = i + 1;
            if (numeros[i] <= 500)
                System.out.println(numeros[i]);
        }
        scan.close();
    }
}