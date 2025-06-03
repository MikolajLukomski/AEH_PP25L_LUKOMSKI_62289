import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mojaTrzynastaAplikacja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        Path inputPath;


        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String input = scanner.nextLine().trim();
            inputPath = Paths.get(input);

            if (Files.exists(inputPath) && Files.isRegularFile(inputPath)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        Path outputPath = Paths.get(scanner.nextLine().trim());

        int totalWordCount = 0;
        Map<String, Integer> wordFrequency = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(inputPath, Charset.defaultCharset())) {

            String line;
            while ((line = reader.readLine()) != null) {


                String[] words = line.split("\\W+");

                for (String w : words) {
                    if (w.isEmpty()) continue;           // pomijamy puste stringi
                    String word = w.toLowerCase();       // ignorujemy wielkość liter

                    totalWordCount++;
                    wordFrequency.merge(word, 1, Integer::sum);
                }
            }

        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
            return;
        }


        System.out.println("Nazwa pliku: " + inputPath.getFileName());
        System.out.println("Liczba wszystkich słów: " + totalWordCount);
        System.out.println("Liczba wystąpień poszczególnych słów:");
        wordFrequency.forEach((k, v) -> System.out.println("   " + k + " : " + v));

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath, Charset.defaultCharset())) {

            writer.write("Plik: " + inputPath.getFileName());
            writer.newLine();
            writer.write("Liczba słów: " + totalWordCount);
            writer.newLine();
            writer.newLine();
            writer.write("Wystąpienia słów:");
            writer.newLine();

            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }

            System.out.println("Wynik zapisano do: " + outputPath.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku wyjściowego: " + e.getMessage());
        }
    }
}