package pl.pp;

import java.util.Scanner;

public class Magazyn {
    private String nazwaMagazynu;
    private int numerMagazynu;
    private final int MAKSYMALNA_POJEMNOSC = 5000;
    private int iloscJednostekWMagazynie;
    private String emailWlasciciela;
    private String numerTelefonuWlasciciela;

    public Magazyn(String nazwaMagazynu, int numerMagazynu) {
        this.nazwaMagazynu = nazwaMagazynu;
        this.numerMagazynu = numerMagazynu;
        this.iloscJednostekWMagazynie = 0;
        this.emailWlasciciela = null;
        this.numerTelefonuWlasciciela = null;
        System.out.println("Utworzono magazyn: " + nazwaMagazynu + " (nr " + numerMagazynu + ") o maksymalnej pojemności: " + MAKSYMALNA_POJEMNOSC + " jednostek.");
    }

    public void dodajJednostki(int ilosc) {
        if (iloscJednostekWMagazynie + ilosc <= MAKSYMALNA_POJEMNOSC) {
            iloscJednostekWMagazynie += ilosc;
            System.out.println("Dodano " + ilosc + " jednostek do magazynu. Aktualna ilość: " + iloscJednostekWMagazynie);
        } else {
            System.out.println("Nie można dodać " + ilosc + " jednostek. Maksymalna pojemność magazynu to " + MAKSYMALNA_POJEMNOSC + " jednostek. Aktualnie jest " + iloscJednostekWMagazynie + " jednostek.");
        }
    }

    public void usunJednostki(int ilosc) {
        if (ilosc <= iloscJednostekWMagazynie) {
            iloscJednostekWMagazynie -= ilosc;
            System.out.println("Usunięto " + ilosc + " jednostek z magazynu. Aktualna ilość: " + iloscJednostekWMagazynie);
        } else {
            System.out.println("Nie można usunąć " + ilosc + " jednostek. W magazynie jest tylko " + iloscJednostekWMagazynie + " jednostek.");
        }
    }

    public void sprawdzStanMagazynu() {
        System.out.println("--- Stan magazynu: " + nazwaMagazynu + " (nr " + numerMagazynu + ") ---");
        System.out.println("Aktualna ilość jednostek w magazynie: " + iloscJednostekWMagazynie + " / " + MAKSYMALNA_POJEMNOSC);
        System.out.println("Email właściciela: " + (emailWlasciciela != null ? emailWlasciciela : "brak danych"));
        System.out.println("Numer telefonu właściciela: " + (numerTelefonuWlasciciela != null ? numerTelefonuWlasciciela : "brak danych"));
        System.out.println("------------------------------------");
    }

    public void aktualizujKontakt(String email, String numerTelefonu) {
        if (email != null) {
            this.emailWlasciciela = email;
            System.out.println("Zaktualizowano email właściciela na: " + this.emailWlasciciela);
        }
        if (numerTelefonu != null) {
            this.numerTelefonuWlasciciela = numerTelefonu;
            System.out.println("Zaktualizowano numer telefonu właściciela na: " + this.numerTelefonuWlasciciela);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magazyn magazyn = new Magazyn("Magazyn", 1);

        while (true) {
            System.out.println("Wybierz akcję:");
            System.out.println("1. Dodaj jednostki");
            System.out.println("2. Usuń jednostki");
            System.out.println("3. Sprawdź stan magazynu i kontakt");
            System.out.println("4. Aktualizuj kontakt właściciela");
            System.out.println("5. Wyjdź");
            System.out.print("Twój wybór: ");

            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    System.out.print("Podaj liczbę jednostek do dodania: ");
                    try {
                        int iloscDodaj = Integer.parseInt(scanner.nextLine());
                        magazyn.dodajJednostki(iloscDodaj);
                    } catch (NumberFormatException e) {
                        System.out.println("Nieprawidłowa ilość.");
                    }
                    break;
                case "2":
                    System.out.print("Podaj liczbę jednostek do usunięcia: ");
                    try {
                        int iloscUsun = Integer.parseInt(scanner.nextLine());
                        magazyn.usunJednostki(iloscUsun);
                    } catch (NumberFormatException e) {
                        System.out.println("Nieprawidłowa ilość.");
                    }
                    break;
                case "3":
                    magazyn.sprawdzStanMagazynu();
                    break;
                case "4":
                    System.out.print("Podaj nowy email właściciela: ");
                    String nowyEmail = scanner.nextLine();
                    System.out.print("Podaj nowy numer telefonu właściciela: ");
                    String nowyNumerTelefonu = scanner.nextLine();
                    magazyn.aktualizujKontakt(
                            nowyEmail.isEmpty() ? null : nowyEmail,
                            nowyNumerTelefonu.isEmpty() ? null : nowyNumerTelefonu
                    );
                    break;
                case "5":
                    System.out.println("Koniec programu.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }
    }
}