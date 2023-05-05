
package pkg3.pkg12.pkg11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long num = 0, num2 = 1, num3 = 0;
        for (int i = 1; i < 100; i++) {

            System.out.println(num);
            num3 = num + num2;
            num = num2;
            num2 = num3;

        }

    }
}