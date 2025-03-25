package pl.pp;
import java.util.Scanner;

public class Zadanie1i2wLAB3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę liczbę dni:");

        while (true) {
            int x = scanner.nextInt();
            int y, z;

            if (x <= 0) {
                System.out.println("Wyjście...");
                break;
            }
            if (x >= 0) {
                y = x/7;
                z = x%7;

                System.out.println(x + " dni to " + y + " tygodnie i " + z + " dni");
                System.out.println("Dziękuję! Oto przeliczona liczba dni na tygonie");
                System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            }
        }
        while (true) {
            System.out.println("Podaj proszę temperaturę w stopniach Fahrenheit'a:");

            double F = scanner.nextDouble();
            if (F == -1) {
                System.out.println("Wyjście...");
                break;
            }
            double C = (F - 32) / 1.8;
            double K = (F + 273.16);

            System.out.println("Dziękuję! Oto przeliczona temperatura stopni Fahrenheit'a ");
            System.out.println("Temperatura w stopniach Fahrenheit'a " + F);
            System.out.println("Temperatura w stopniach Celsjusza " + C );
            System.out.println("Temperatura w stopniach Kelvina  " + K );
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");

        }



    }
}