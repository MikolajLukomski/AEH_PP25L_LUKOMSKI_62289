import java.util.Scanner;

public class mojaSiodmaAplikacja {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.address = "Poznań";
        person1.birthday = "6 luty 2001";


        Person person2 = new Person("Dariusz", "Walendziak", 42, "Warszawa", "19 kwiecień 1983");

        Scanner scanner = new Scanner(System.in);

        // Wyświetlenie początkowych danych
        System.out.println("Początkowe dane:");
        person1.hiToAll();
        person2.hiToAll();


        System.out.print("Ile lat chcesz dodać do wieku osoby 1? ");
        int yearsToAddPerson1 = scanner.nextInt();
        person1.age += yearsToAddPerson1; // Zwiększanie wieku o wprowadzone lata
        person1.hiToAll();

        System.out.print("Ile lat chcesz dodać do wieku osoby 2? ");
        int yearsToAddPerson2 = scanner.nextInt();
        person2.age += yearsToAddPerson2; // Zwiększanie wieku o wprowadzone lata
        person2.hiToAll();

        // Opcjonalnie - odjęcie 1 roku
        System.out.print("Czy chcesz odmłodzić osobę 1 o 1 rok? (tak/nie): ");
        String responsePerson1 = scanner.next();
        if (responsePerson1.equalsIgnoreCase("tak")) {
            person1.age--; // Odmłodzenie o 1 rok
            person1.hiToAll();
        }

        System.out.print("Czy chcesz odmłodzić osobę 2 o 1 rok? (tak/nie): ");
        String responsePerson2 = scanner.next();
        if (responsePerson2.equalsIgnoreCase("tak")) {
            person2.age--; // Odmłodzenie o 1 rok
            person2.hiToAll();
        }

        scanner.close();
    }
}