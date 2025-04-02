package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę granice");

        while (true) {
            System.out.print("Podaj proszę dolną granicę: ");
            int dolna = scanner.nextInt();

            System.out.print("Podaj proszę górną granicę: ");
            int gorna = scanner.nextInt();

            if (dolna <= gorna) {
                int suma = 0;
                for (int i = dolna; i <= gorna; i++) {
                    suma += i * i;
                }
                System.out.println("Suma kwadratów liczb " + dolna + " i " + gorna + " wynosi " + suma);
                break;
            }


        }
    }
}




