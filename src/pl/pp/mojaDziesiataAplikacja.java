package pl.pp;
import java.util.Arrays;
import java.util.Scanner;
public class mojaDziesiataAplikacja {

    public static int[] countAndSumElements(int[] input) {
        int iloscUjemnych = 0;
        int sumaDodatnich = 0;

        for (int liczba : input) {
            if (liczba < 0) {
                iloscUjemnych++;
            } else if (liczba > 0) {
                sumaDodatnich += liczba;
            }
        }

        return new int[] {iloscUjemnych, sumaDodatnich};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int rozmiar = scanner.nextInt();

        int[] tablicaUzytkownika = new int[rozmiar];

        System.out.println("Podaj " + rozmiar + " liczb całkowitych:");

        for (int i = 0; i < rozmiar; i++) {
            System.out.print("Podaj liczbę nr " + (i + 1) + ": ");
            tablicaUzytkownika[i] = scanner.nextInt();
        }

        int[] wyniki = countAndSumElements(tablicaUzytkownika);

        System.out.println("Wynik (ilość ujemnych, suma dodatnich): " + Arrays.toString(wyniki));

        scanner.close();
    }
}