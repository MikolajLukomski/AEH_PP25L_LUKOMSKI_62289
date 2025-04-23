public class Person {
    // Pola klasy
    String forename;
    String surname;
    int age;
    String address;
    String birthday;

    // Konstruktor bezparametrowy
    public Person() {
    }

    // Konstruktor z parametrami
    public Person(String forename, String surname, int age, String address, String birthday) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    // Metoda do przywitania się
    public void hiToAll() {
        System.out.println("Cześć, jestem " + forename + " " + surname + ". Mam " + age + " lat. Mieszkam w " + address + ". Moje urodziny to " + birthday + ".");
    }

    // Metoda do zwiększania wieku o 1 rok
    public void growOld() {
        this.age++; // Zwiększenie wieku o 1 rok
    }

    // Metoda do zwiększania wieku o określoną liczbę lat
    public void growOldByYears(int years) {
        this.age += years; // Zwiększenie wieku o wybraną liczbę lat
    }

    // Metoda do odmładzania
    public void beYounger() {
        this.age = Math.max(0, this.age - 1); // Odmładzanie, minimalny wiek to 0
    }
}