package pkg3.pkg10.pkg6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int A1, A2;
        int MCD = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        A1 = sc.nextInt();
        System.out.println("INGRESE OTRO NUMERO:");
        A2 = sc.nextInt();
        for (int i = 1; i <= A1; i++) {
            if (A1 % i == 0 && A2 % i == 0) {
                MCD = i;
            }
        }
        System.out.println("MCD " + A1 + "Y " + A2 + "ES = " + MCD);
        sc.close();
    }
}
