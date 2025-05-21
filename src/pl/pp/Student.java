import java.util.List;

public class Student {
    private String index;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Student(String index, String imie, String nazwisko, List<Integer> oceny) {
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public String getIndex() {
        return index;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public double getSrednia() {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return (double) suma / oceny.size();
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + index + ") - Average: " + String.format("%.2f", getSrednia());
    }
}