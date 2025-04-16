package pl.pp;

import java.util.Scanner;

public class mojaSzostaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe do obliczenia silni: ");
        int n = scanner.nextInt();


        long startIter = System.nanoTime();
        long wynikIter = silniaIteracyjna(n);
        long endIter = System.nanoTime();
        System.out.println("Silnia iteracyjnie (" + n + "!) = " + wynikIter);
        System.out.println("Czas iteracyjny: " + (endIter - startIter) + " ns");


        long startRek = System.nanoTime();
        long wynikRek = silniaRekurencyjna(n);
        long endRek = System.nanoTime();
        System.out.println("Silnia rekurencyjnie (" + n + "!) = " + wynikRek);
        System.out.println("Czas rekurencyjny: " + (endRek - startRek) + " ns");

        scanner.close();
    }

    public static long silniaIteracyjna(int n) {
        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static long silniaRekurencyjna(int n) {
        if (n <= 1)
            return 1;
        return n * silniaRekurencyjna(n - 1);
    }
}