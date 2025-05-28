package pl.pp;

import java.io.*;
import java.util.Scanner;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String inputPath = scanner.nextLine();

            System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
            String outputPath = scanner.nextLine();


            int lineCount = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
                String line = reader.readLine();
                while (line != null) {
                    lineCount++;
                    line = reader.readLine();
                }
            }


            System.out.println("Liczba linii w pliku wejściowym: " + lineCount);


            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write("Nazwa pliku: " + inputPath + "");
                writer.write("Liczba linii: " + lineCount + "");
            }

            System.out.println("Wynik zapisany do pliku: " + outputPath);

        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje. Podana ścieżka jest nieprawidłowa.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas czytania lub zapisu pliku.");
        }
    }
}
