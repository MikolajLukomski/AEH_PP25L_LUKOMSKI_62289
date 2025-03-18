package pl.pp;

import java.util.Scanner;

public class zadanie22 {
    public static void main(String[]  args) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Proszę podać swój wiek!");
    int age = scanner.nextInt();

    long PrzeliczonyCzas = (long) age  * 365 * 24 * 60 * 60;
            System.out.println(" Oto twój wiek przeliczony na sekundy " + PrzeliczonyCzas + "s" );

    scanner.close();















    }



}
