import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student najlepszy = students.get(0);
        for (Student s : students) {
            if (s.getSrednia() > najlepszy.getSrednia()) {
                najlepszy = s;
            }
        }

        System.out.println("Student z najwyższą średnią: " + najlepszy);
        System.out.println();


        students.sort(Comparator.comparing(Student::getNazwisko));

        System.out.println("Studenci posortowani według nazwisk:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}