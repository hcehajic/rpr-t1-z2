package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int broj) {
        int suma = 0;
        do {
            suma = suma + broj % 10;
            broj = broj / 10;
        } while (broj != 0);
        return suma;
    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite neki broj n: ");
        int n = unos.nextInt();
        System.out.println("Brojevi djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
