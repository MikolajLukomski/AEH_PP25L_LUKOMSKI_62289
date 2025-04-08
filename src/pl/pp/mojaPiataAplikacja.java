package pl.pp;

import java.util.Scanner;

public class mojaPiataAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj znak do wyswietlenia:");
        String znak = scanner.next();

        System.out.println("Ile znakow w jednym wierszu?");
        int kolumny = scanner.nextInt();

        System.out.println("Ile wierszy?");
        int wiersze = scanner.nextInt();

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}